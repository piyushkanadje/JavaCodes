package Searching;

public class searchInRotatedArray {

	// naive solution
	static int naiveSearch(int[] a, int x) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// effective Solution using binary search
	static int effectiveSearch(int[] a, int x) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] > a[low]) {
				if (x >= a[low] && x < a[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (x > a[mid] && x <= a[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 40, 60, 5, 8 }, n = 6;

		int x = 5;
		int a = effectiveSearch(arr, x);
		System.out.println(a);
	}

}
