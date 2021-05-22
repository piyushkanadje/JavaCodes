package com.semanticsquar.opp.practice;

public class bitmagc {
	static void check(int n, int k) {
		if ((n & (1 << (k - 1))) != 0) {
			System.out.println("YEs");
		} else {
			System.out.println("Npo");
		}

	}

	static void checkr(int n, int k) {
		if ((n >> (k - 1) & 1) == 1) {
			System.out.println("YEs");
		} else {
			System.out.println("Npo");
		}

	}

	// check odd

	static void checkOdd(int[] arr) {

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
	//check oddd
	
 static int  chekODF(int[] arr) {
	 int res  = 0;
	 for(int i = 0 ; i<arr.length ; i++) {
		 res =res ^ arr[i];
	 }
	 return res;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 4, 1, 2, 2 };
		checkOdd(arr);
		System.out.println(chekODF(arr));
	}

}
