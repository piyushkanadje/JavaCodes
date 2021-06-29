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

	// recursive function
	static int recusrsiveSol(int n) {
		if (n == 0) {
			return 0;
		}
		return (1 + recusrsiveSol(n / 10));
	}

	static int count(int a) {
		int c = 0;
		while (a > 0) {
			a = a / 10;
			c++;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(count(123));
	}

}
