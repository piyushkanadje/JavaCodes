package com.semanticsquare.opp.codes;

public class TraillingZeroes {
//traditional method
	static int zeros(int n) {
		int facto = 1;
		for (int i = 2; i <= n; i++) 
			facto = facto * i;
		
		int zeroes = 0;
		while (facto % 10 == 0) {
			zeroes++;
			facto = facto / 10;
		}

		return zeroes;
	}
	// n/5 n/25 n/125

	static int traillingZero(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + (n / i);

		}
		return res;
	}

	// Trailing Zeroes of any factorial of a number
	static long zero(long n) {
		long res = 0;
		for (long i = 5; i <= n; i = i * 5) {
			res = res + (n / i);
		}
		return res;
	}

	static int traill(int n) {
		int res = 0;
		for (int i = 5; i <= n; i *= 5) {
			res = res + (n / i);
		}
		return res;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(factorial(25));
		System.out.println((summ(4)));

	}

}
