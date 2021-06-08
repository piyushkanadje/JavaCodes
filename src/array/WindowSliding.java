package array;

public class WindowSliding {

	// naive solution
	static int maxSum(int arr[], int k) {
		int n = arr.length;
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i + k - 1 < n; i++) {
			int sum = 0;

			for (int j = 0; j < k; j++) {
				sum += arr[i + j];
			}
			System.out.println(sum);
			max_sum = Math.max(max_sum, sum);
		}
		return max_sum;
	}

	// efficient solution O(n)
	static int maxSum1(int[] a, int k) {
		int n = a.length;
		int curr_sum = 0;
		for (int i = 0; i < k; i++) {
			curr_sum += a[i];
		}
		int max_sum = curr_sum;
		for(int i = k ; i < n ; i++) {
			curr_sum +=a[i] - a[i-k];
			max_sum = Math.max(max_sum, curr_sum);
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 8, 30, -5, 20, 7 };
		int k = 3;
		System.out.println(maxSum1(a, k));

	}

}
