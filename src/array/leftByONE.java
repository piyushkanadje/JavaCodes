package array;

import java.util.ArrayList;
import java.util.List;

public class leftByONE {
	static void leff(int[] a) {
		int n = a.length;
		int temp = a[0];
		for (int i = 1; i < n; i++) {
			a[i - 1] = a[i];

		}
		a[n - 1] = temp;

	}

	// naive method to left rotate by d
	static void leftD(int[] a, int d) {
		for (int i = 0; i < d; i++) {
			leff(a);
		}
	}

	// better method to rotate

	static void leftRotate(int[] a, int d) {
		int[] temp = new int[d];
		int n = a.length;
		for (int i = 0; i < d; i++) {
			temp[i] = a[i];
		}
		for (int i = d; i < a.length; i++) {
			a[i - d] = a[i];
		}
		for (int i = 0; i < d; i++) {
			a[n - d + i] = temp[i];
		}
	}

	static void rev(int[] a, int d) {
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = a[i];
		}
		for (int i = d; i < a.length; i++) {
			a[i - d] = a[i];
		}
		for(int i = 0; i < d ; i++) {
			a[a.length -d +i ] = temp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 20, 30 };
		leftD(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
