package com.semanticsquare.opp.codes;

public class Power {

	static int power(int x, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * x;
		}
		return res;

	}

	// power optimise
	static int powerO(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int temp = powerO(x, n / 2);
		temp = temp * temp;
		if (n % 2 == 0) {
			return temp;
		} else {
			return temp * x;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerO(2, 3));
	}

}
