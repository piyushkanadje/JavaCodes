package array;

public class SubArraySum {

	// Naive solution

	static int maxSum(int[] arr) {
		int n = arr.length;
		int res = arr[0];

		for (int i = 0; i < n; i++) {
			int curr = 0;

			for (int j = i; j < n; j++) {
				curr = curr + arr[j];

				res = Math.max(res, curr);
			}
		}

		return res;
	}

	// Efficient Method

	static int maxSum1(int[] a) {
		int res = a[0];
		int maxEnding = a[0];
		for (int i = 1; i < a.length; i++) {
			maxEnding = Math.max(maxEnding + a[i], a[i]);
			res = Math.max(maxEnding, res);
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, -2, 3, -1, 2 }, n = 5;

		System.out.println(maxSum1(arr));
	}

}
