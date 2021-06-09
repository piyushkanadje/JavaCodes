package array;

public class PrefixSum {
	// getSum queries
	static int[] preSum(int arr[]) {
		int n = arr.length;
		int prefix_sum[] = new int[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			prefix_sum[i] = sum;
		}

		return prefix_sum;
	}

	static int getSum(int prefix_sum[], int l, int r) {
		if (l != 0)
			return prefix_sum[r] - prefix_sum[l - 1];
		else
			return prefix_sum[r];
	}

	// Equilibrium point
	static int equillibrium(int[] a) {
		int n = a.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			int lsum = 0;
			for (int j = 0; j < i; j++) {

				lsum = lsum + a[j];

			}

			int rsum = 0;

			for (int k = i + i; k < n; k++) {

				rsum = rsum + a[i];
			}
			if (lsum == rsum) {

				res = i;
			}

		}
		return res;

	}

	// Another Approach of equilibrium
	static void equi(int[] arr) {

		int n = arr.length;
		int prefix_sum[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			prefix_sum[i] = sum;
		}
		int suffix_sum[] = new int[n];
		for (int i = 0; i < n; i++) {
			int sufSum = 0;
			for (int j = i + 1; j < n; j++) {
				sufSum = sufSum + arr[j];
				suffix_sum[i] = sufSum;
			}

		}
//		for(int i = 0; i < n ; i ++) {
//			System.out.println(suffix_sum[i]);
//		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (prefix_sum[i] == suffix_sum[i]) {
				res = i;
			}
		}
		System.out.println(arr[res]);
	}

	// most efficient method
	static boolean checkEquilibrium(int arr[], int n) {
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		int l_sum = 0;

		for (int i = 0; i < n; i++) {
			if (l_sum == sum - arr[i])
				return true;

			l_sum += arr[i];

			sum -= arr[i];
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 8, 10, 20 };
		int arr[] = { 2, 8, 3, 9, 6, 5, 4 }, n = 7;
		int eq[] = { 4, 2, -2 };
		int arrr[] = { 3, 4, 8, -9, 20, 6 };

//		int prefix_sum[] = preSum(arr);
//		for (int i = 0; i < n; i++) {
//			System.out.print(prefix_sum[i] + " ");
//		}
//
//		System.out.println(getSum(prefix_sum, 1, 3));
//
//		System.out.println(getSum(prefix_sum, 0, 2));
//		int g = equillibrium(eq);
//		System.out.println(eq[g]);
		equi(eq);
	}

}
