package com.semanticsquare.opp.codes;

public class NbonacciSeries {
	// Function to print bonacci series
	static void bonacciseries(int n, int m) {
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = 0;
		}
		a[n - 1] = 1;
		a[n] = 1;
		// using sling window
		for (int i = n + 1; i < m; i++) {
			a[i] = 2 * a[i - 1] - a[i - n - 1];
		}

		// Printing result
		for (int i = 0; i < m; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3, M = 8; 
		bonacciseries(N, M); 
	}

}
