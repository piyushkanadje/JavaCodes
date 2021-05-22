package com.semanticsquare.opp.bitmagic;

public class TwoOdd {

//	naive method
	static void twoOddN(int[] arr) {
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

//naivr 

	static void two(int[] arr) {
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

	static void checkTw(int[] arr) {
		int xor = 0;
		int res = 0;
		int res2 = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		int right = xor ^ ~(xor - 1);
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & right) != 0) {
				res = res ^ arr[i];
			} else {
				res2 = res2 ^ arr[i];
			}
		}
		System.out.println(res + " " + res2);
	}

	// another method using groups of number having last bit is set and one group
	// having last bit is not set
	static void checkTwo(int[] arr) {
		int xor = 0;
		int res1 = 0;
		int res2 = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		int rightSet = xor & ~(xor - 1);
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & rightSet) != 0) {
				res1 = res1 ^ arr[i];

			} else {
				res2 = res2 ^ arr[i];
			}
		}
		System.out.println("First Number is " + res1 + ' ' + " Seconf Number is " + res2);

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 3, 4, 8, 4, 4, 32, 7, 7 };
		checkTw(arr);
	}

}
