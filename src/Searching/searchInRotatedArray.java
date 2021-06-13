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
		while(low<=high)

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
