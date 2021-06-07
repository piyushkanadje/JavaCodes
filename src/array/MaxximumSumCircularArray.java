package array;

public class MaxximumSumCircularArray {

	static int maxCircularSum(int[] a) {
		int res = a[0];
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int curr_max = a[i];
			int curr_sum = a[i];
			for (int j = 1; j < n; j++) {
				int index = (i + j) % n;
				curr_sum += a[index];
				curr_max = Math.max(curr_max, curr_sum);
			}
			res = Math.max(curr_max, res);

		}
		return res;
	}

	// efficient solution

	static int normalMaxSum(int arr[]) {
		int res = arr[0];
		int n = arr.length;
		int maxEnding = arr[0];

		for (int i = 1; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);

			res = Math.max(maxEnding, res);
		}

		return res;
	}

	static int overallMaxSum(int arr[]) {
		int n = arr.length;
		int max_normal = normalMaxSum(arr);

		if (max_normal < 0)
			return max_normal;

		int arr_sum = 0;

		for (int i = 0; i < n; i++) {
			arr_sum += arr[i];

			arr[i] = -arr[i];
		}

		int max_circular = arr_sum + normalMaxSum(arr);

		return Math.max(max_circular, max_normal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, -2, 3, 4 }, n = 4;

		System.out.println(overallMaxSum(arr));

	}

}
