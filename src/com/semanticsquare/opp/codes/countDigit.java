package com.semanticsquare.opp.codes;

public class countDigit {
//count digits 
	static int countDigits(int n) {
		int count = 0;
		if (n == 0) {
			return 1;
		}
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	static int count(int n) {
		if (n == 0) {
			return 1;
		}
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countDigits(123));
	}

}
