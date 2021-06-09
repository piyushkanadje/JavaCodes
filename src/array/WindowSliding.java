package array;

public class WindowSliding {
// Find the highest sum of element of k 
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
		for (int i = k; i < n; i++) {
			curr_sum += a[i] - a[i - k];
			max_sum = Math.max(max_sum, curr_sum);
		}
		return max_sum;
	}

	// Find subarray with given sum

	// naive Solution
	static boolean subArraySum(int[] a, int sum) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int s = 0;
			for (int j = i ; j < n; j++) {
				s = s + a[j];
				if (s == sum) {
					return true;
				}
			}
		}
		return false;
	}
 
	//efficient solution
	/* Returns true if the there is a subarray of arr[] with sum equal to 
	'sum' otherwise returns false. Also, prints the result */
	int subArraySum(int arr[], int n, int sum) 
	{ 
		int curr_sum = arr[0], start = 0, i; 

		// Pick a starting point 
		for (i = 1; i <= n; i++) 
		{ 
			// If curr_sum exceeds the sum, then remove the starting elements 
			while (curr_sum > sum && start < i-1) 
			{ 
				curr_sum = curr_sum - arr[start]; 
				start++; 
			} 
			
			// If curr_sum becomes equal to sum, then return true 
			if (curr_sum == sum) 
			{ 
				int p = i-1; 
				System.out.println("Sum found between indexes " + start 
						+ " and " + p); 
				return 1; 
			} 
			
			// Add this element to curr_sum 
			if (i < n) 
			curr_sum = curr_sum + arr[i]; 
			
		} 

		System.out.println("No subarray found"); 
		return 0; 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 8, 30, 5, 20, 7 };
		int k = 3;
		System.out.println(subArraySum(a,25 ));

	}

}
