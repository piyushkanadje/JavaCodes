package Searching;

public class countOccuranceInSorted {
	static int freqOfX(int[] a, int x) {
		int count = 0;
		int n = a.length;

		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				count++;
			}
		}
		return count;

	}

	static int countOcc(int[] a, int x) {
		int n = a.length;
		int low = 0;
		int i = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] < x) {
				low = mid + 1;
			} else if (a[mid] > x) {
				high = mid - 1;
			} else {
				if (mid == 0 || a[mid] != a[mid - 1]) {
					i++;
					return i;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 20, 20, 40, 40 }, n = 6;

		int x = 20;
		System.out.println(freqOfX(arr, x));
	}

}
