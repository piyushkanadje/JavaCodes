package com.semanticsquare.opp.codes;

public class Divisor {
	static void divisors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	// divisors alaways came in pairs not in sorted order
	static void divisorsPair(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);

				if (i != n / i) {
					System.out.println(n / i);
				}

			}
		}
	}

	static void a(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				if (i != n / i) {
					System.out.println(n / i);
				}
			}
		}
	}

	static void div(int n) {
		for (int i = 1; i * i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				if (i != n / i) {
					System.out.println(n / i);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div(20);

		// printDivisors(20);
		// System.out.println(divisorO(25));
		// System.out.println(divisorrs(12));
		// System.out.println(lcm(20, 30));
		// divisorrs(20);
		// div(20);
		// System.out.println(pow(5, 2));

	}

}
