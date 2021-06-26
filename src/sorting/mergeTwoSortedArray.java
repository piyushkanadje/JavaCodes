package sorting;

import java.util.Arrays;

public class mergeTwoSortedArray {

	// naive solution
	static void merge(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int[] c = new int[n + m];
		for (int i = 0; i < m; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < n; i++) {
			c[m + i] = b[i];
		}
		Arrays.sort(c);
		for (int i = 0; i < m + n; i++) {
			System.out.print(c[i] + " ");
		}

	}

	// efficient solution
	static void mergeTwoSortedArray(int[] a, int[] b) {
		int m = a.length;
		int n = b.length;
		int i = 0;
		int j = 0;
		while (i < m && j < n) {
			if (a[i] <= b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else {
				System.out.print(b[j] + " ");

				j++;
			}
		}
		while (i < m)
			System.out.print(a[i++] + " ");
		while (j < n)
			System.out.print(b[j++] + " ");

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 10, 15, 20, 40 };
		int b[] = new int[] { 5, 6, 6, 10, 15 };
		merges(a, b);
	}

}
