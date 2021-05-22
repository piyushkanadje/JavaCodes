package com.semanticsquare.opp.codes;

public class Factorial {
	static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++)
			fact = fact * i;
		return fact;

	}

	static int recursiveFactorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}

		return n * recursiveFactorial(n - 1);

	}

	static int recursive(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * recursive(n - 1);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trail(25));
		System.out.println(recursiveFactorial(5));
	}

}
