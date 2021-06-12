package Searching;

public class searchElementInMillion {
	// naive solun
	static int naiveSearchInMillion(int[] a, int x) {
		int i = 0;
		while (a[i] <= x) {
			if (a[i] == x) {
				return i;
			}
			i++;
		}
		return -1;
	}

	// effective solution using binary search

	static int binarySearch(int[] a, int x, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] > x) {
				return binarySearch(a, x, low, mid - 1);
			} else {
				return binarySearch(a, x, mid + 1, high);
			}
		}
		return -1;
	}

	static int effectiveSearchInMillion(int[] a, int x) {
		if (a[0] == x) {
			return 0;
		}
		int i = 1;
		while (a[i] <= x) {
			i = i * 2;
			if (a[i] == x) {
				return i;
			}
		}
		 return binarySearch(a, x, i/2+1, i-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 5, 5 };

		int x = 3;

		System.out.println(effectiveSearchInMillion(arr, x));
	}

}
