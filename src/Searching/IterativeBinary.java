package Searching;

public class IterativeBinary {
	static int bSearch(int[] a, int x) {
		int n = a.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

			int x = 20;
	    
	        System.out.println(bSearch(arr, x));
	}

}
