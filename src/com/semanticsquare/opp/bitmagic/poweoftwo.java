package com.semanticsquare.opp.bitmagic;

public class poweoftwo {

	static boolean checkPow(int n) {
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			if (n % 2 != 0) {
				return false;

			}
			n = n >> 1;
		}
		return true;

	}

	static boolean check(int n) {
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}

	// using bran
	static boolean pow(int n) {
		if (n == 0) {
			return false;
		}
		return ((n & (n - 1)) == 0);

	}

	static void pritn(int n) {
		if (n == 0) {
			return;

		}
		pritn(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1, 100);
		// prime(25);
		// System.out.println(pow(4));
		// System.out.println(check(2));
		pritn(100);
	}

}
