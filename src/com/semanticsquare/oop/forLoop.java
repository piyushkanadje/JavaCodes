package com.semanticsquare.oop;

public class forLoop {

	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;

		}
//		int factorial = n;
//		while (n >= 2) {
//			factorial = factorial * (n - 1);
//			n--;
//		}
		return n * factorial(n - 1);

	}

	static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;

			printNum(num);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(factorial(4));
//		int x = 24;
//		int count = 0;
//		for (int i = 1; i <= x; i++) {
//			if (x % i == 0) {
//				count++;
//				System.out.print(" " + i);
//			}
//		}
//		System.out.println(count);
//
//		int[] iArray = { 1, 2, 3, 4, 5, 6, 7 };
//		for (int i = 0; i < iArray.length; i++) {
//			System.out.println(iArray[i]);
//
//		}
//
//		// Swapping of element
//
//		for (int i = 0, j = iArray.length - 1, middle = iArray.length / 2; i < middle; i++, j--) {
//			int temp = iArray[i];
//			iArray[i] = iArray[j];
//			iArray[j] = temp;
//
//		}
//
//		for (int i = 0; i < iArray.length; i++) {
//			System.out.println(iArray[i]);
//
//		}
//		printNum(1);
		int[][] a = { { 1, 2, 4, 5, 6 }, { 52, 526 } };
		for (int i = 0; i < a.length; i++) {
			int max = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];

				}
         System.out.println("Max is assigned to " + max);
			}
			System.out.println("Final Max value is" + max);
		}

		int[] diec1 = { 1, 2, 3, 4, 5, 6 };
		int[] diec2 = { 1, 2, 3, 4, 5, 6 };

		int count = 0;
		for (int i = 0; i < diec1.length; i++) {
			for (int j = 0; j < diec2.length; j++) {
				System.out.println(diec1[i] + " " + diec2[j]);
				count++;
			}

		}
		System.out.println(count);

	}

}
