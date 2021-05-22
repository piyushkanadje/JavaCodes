package com.semanticsquare.opp.codes;

public class GCD {
	static int GCD(int a, int b) {
		int res = Math.min(a, b);
		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}

	static int gcdd(int a, int b) {
		int res = Math.min(a, b);
		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}

	// EULIDEAN ALGORITHM
	static int gcdE(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	// Optimism
	static int recursiveGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return recursiveGCD(b, a % b);
		}

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursiveGCD(10, 5));
	}

}
