package Searching;

public class twoPointer {

	// naive solution to check sum
	static boolean checkSum(int[] a, int x) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int z = i;
			while (i < n) {
				if (a[z] + a[i] == x) {
					return true;
				}
				i++;
			}
		}
		return false;
	}

	// using two pointer approach in sorted array
	static boolean checkSumm(int[] a, int x) {
		int n = a.length;
		int left = 0;
		int right = n - 1;
		while (left < right) {
			if (a[left] + a[right] == x) {
				return true;
			} else if (a[left] + a[right] > x) {
				right--;
			} else {
				left++;
			}
		}

		return false;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 34, 23, 5, 7, 12 };
		int arr[] = { 2, 3, 5,7, 8, 11};
		int x = 12;
		boolean v = checkSumm(arr, x);
		System.out.println(v);
	}

}
