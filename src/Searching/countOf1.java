package Searching;

public class countOf1 {
	// naive soln
	static int naiveSoln(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == 1) {
				return n - i;
			}
		}
		return -1;
	}

	static int count1s(int[] a) {
		int n = a.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == 0) {
				low = mid + 1;

			} else {
				if (a[mid] == 0 || a[mid - 1] == 0) {
					return n - mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 0, 1, 1, 1, 1 };
		int a = effictiveSoln(arr);
		System.out.println(a);
	}

}
