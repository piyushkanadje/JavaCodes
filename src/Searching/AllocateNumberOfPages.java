package Searching;

public class AllocateNumberOfPages {
	// here ans is mid which is calculate in following function
	public static boolean isFeasible(int[] a, int k, int ans) {
		int res = 1;
		int n = a.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (sum + a[i] > ans) {
				res++;
				sum = a[i];
			} else {
				sum += a[i];
			}
		}
		return (res <= k);

	}

	static int minPages(int[] a, int k) {
		int n = a.length;
		int sum = 0;
		int mx = 0;

		for (int i = 0; i < n; i++) {
			sum += a[i];
			mx = Math.max(mx, a[i]);
		}
		int low = mx;
		int high = sum;
		int res = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isFeasible(a, k, mid)) {
				res = mid;
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={10,20,10,30};
	        int n=arr.length;
	        int k=2;
	        
	    	System.out.print(minPages(arr,k));
	}

}
