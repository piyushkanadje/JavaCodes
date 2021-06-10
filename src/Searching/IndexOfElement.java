package Searching;

public class IndexOfElement {
	// naive method
	static int naive(int[] a, int x) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// using recursive bs

	static int firstOc(int[] a, int low, int high, int x) {

		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (a[mid] > x) {
			return firstOc(a, low, mid - 1, x);
		} else if (a[mid] < x) {
			return firstOc(a, mid + 1, high, x);
		} else {
			if (mid == 0 || a[mid - 1] != a[mid]) {
				return mid;
			} else {
				return firstOc(a, low, mid - 1, x);
			}
		}
	}

	// using iterative solution
	static int firstOcc(int[] a, int x) {
		int n = a.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] < x) {
				low = mid + 1;
			} else if (a[mid] > x) {
				high = mid - 1;
			} else {
				if (mid == 0 || a[mid] != a[mid - 1]) {
					return mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 10, 10, 15, 20, 20, 20 }, n = 7;

		int x = 20;

		System.out.println(firstOc(arr, 0, n - 1, x));
		System.out.println(firstOcc(arr,x));
	}

}
