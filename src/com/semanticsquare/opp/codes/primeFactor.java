package com.semanticsquare.opp.codes;

public class primeFactor {

	static boolean prime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return false;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

//	static void primefactor(int n) {
//		for (int i = 2; i <n; i++) {
//			if (prime(i)) {
//				int x = i;
//				while (n % x == 0) {
//					System.out.println(i);
//					x = x * i;
//				}
//			}
//		}
//	}

	static void primeFactorO(int n) {

		if (n <= 1) {
			return;
		}
		while (n % 2 == 0) {
			System.out.println(2);
			n = n / 2;
		}

		while (n % 3 == 0) {
			System.out.println(3);
			n = n / 3;
		}
		for (int i = 5; i * i <= n; i += 6) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			while (n % (i + 2) == 0) {
				System.out.println((i + 2));
				n = n / (i + 2);
			}

		}
		if (n > 3) {

			System.out.println(n);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primeFactorO(20);
		practice(20);

	}

}
