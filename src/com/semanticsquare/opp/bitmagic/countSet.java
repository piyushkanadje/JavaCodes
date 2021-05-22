package com.semanticsquare.opp.bitmagic;

public class countSet {

	static int countN(int n) {
		int res = 0;
		while (n > 0) {
			if (n % 2 != 0) {
				res++;

			}
			n = n / 2;
		}
		return res;
	}

	

	// brian algorithm
	static int countNum(int n) {
		int res = 0;
		while (n > 0) {
			n = (n & (n - 1));
			res++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countNum(5));
	}

}
