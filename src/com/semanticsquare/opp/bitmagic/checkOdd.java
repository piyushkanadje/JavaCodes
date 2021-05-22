package com.semanticsquare.opp.bitmagic;

public class checkOdd {

	 	// naive methode
	static void countOddY(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}
			if (count % 2 != 0) {
				System.out.println(arr[i]);
			}

		}

	}
	// using xor
	static int findOdd(int arr[]) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(countNum(5));
		int[] arr = { 4, 4, 1, 2, 2 };
		countOddY(arr);
		System.out.println(findOdd(arr));
	}
}
