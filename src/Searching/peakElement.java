package Searching;

public class peakElement {
	static void peak(int[] a) {
		int n = a.length;
		if (n == 1) {
			System.out.println(a[0]);
		}
		if (a[0] >= a[1]) {
			System.out.println(a[0]);
		}
		if (a[n - 1] >= a[n - 2]) {
			System.out.println(a[n - 1]);
		}
		for (int i = 1; i < n - 1; i++) {
			if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
				System.out.println(a[i]);
			}
		}
	}

	// effective soln using binary search
	static int getPeak(int arr[]) {
		int n = arr.length;
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
				return mid;
			} else if (mid > 0 && arr[mid - 1] >= arr[mid]) {
				high = mid - 1;
			} else {

				low = mid + 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 7, 8, 20, 12 }, n = 5;
		System.out.println(getPeak(arr));
	}

}
