package Searching;

public class LastIndexOfElement {

	static int naviveSol(int[] a, int x) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// log(n) solution recursive approach

	static int lastOcc(int arr[], int low, int high, int x, int n) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;

		if (x > arr[mid])
			return lastOcc(arr, mid + 1, high, x, n);

		else if (x < arr[mid])
			return lastOcc(arr, low, mid - 1, x, n);

		else {
			if (mid == n - 1 || arr[mid + 1] != arr[mid])
				return mid;

			else
				return lastOcc(arr, mid + 1, high, x, n);
		}

	}

	// iterative code
	static int iterativeLocc(int[] a, int x) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid] > x) {
				high = mid - 1;
			} else if (a[mid] < x) {
				low = mid + 1;
			} else {
				if (mid == a.length - 1 || a[mid] != a[mid + 1]) {
					return mid;
				} else {
					low = mid + 1;
				}
			}

		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 5, 10, 10, 10, 10, 20, 20 }, n = 7;

		int x = 10;
		int b = iterativeLocc(arr, x);
		System.out.println(b);
		/// System.out.println(lastOcc(arr, 0, n - 1, x, n));
	}

}
