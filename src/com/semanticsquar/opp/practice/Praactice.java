package com.semanticsquar.opp.practice;

public class Praactice {
	/// count digit
	static int countDigit(long n) {
		if (n == 1) {
			return 1;
		}
		int count = 0;
		while (n > 0) {

			count++;
			n = n / 10;
		}
		return count;
	}

//DIVISORS
	static void divisors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}

//Divisors are came in pairs
	static void divisorsP(int n) {
		for (int i = 1; i * i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);

				if (i != n / i) {
					System.out.println(n / i);
				}
			}
		}
	}

	// factorial
	static int factorial1(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

	// factorial recursivestat
	static int factorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * factorial1(n - 1);
	}

//gcd naive 
	static int gcd(int a, int b) {
		int res = Math.min(a, b);
		while (res > 0) {
			if ((a % res == 0) && (b % res == 0)) {
				break;
			}
			res--;

		}
		return res;
	}

//elucideine metyhod
	static int gcdE(int a, int b) {
		while (a != b) {
			if (a > b) {
				return a = a - b;
			} else {
				return b = b - a;
			}
		}
		return a;
	}

	/// recursive
	static int gcdR(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcdR(b, a % b);
	}

//LCM

	static int lcm(int a, int b) {
		if (b == 0) {
			return a;
		}
		int lcm = a * b / gcdR(a, b);
		return lcm;

	}

	// palindrome
	static boolean pali(int n) {
		int res = 0;
		int temp = n;
		while (temp != 0) {

			int ld = temp % 10;
			res = res * 10 + ld;
			temp = temp / 10;
		}
		return (res == n);
	}

///power
	static int pow(int x, int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * x;
		}
		return res;
	}

	// power
	static int powe(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int temp = powe(x, n / 2);
		temp = temp * temp;
		if (n % 2 == 0) {
			return temp;
		} else {
			return x * temp;
		}
	}

//prime 
	static boolean prime(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	static boolean primee(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	static boolean pr(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i < n; i += 6) {
			if (n % i == 0) {
				return false;
			}
			if (n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	// primeFactor4

	static void primeFactor(int n) {
		for (int i = 2; i < n; i++) {
			if (prime(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.print(i);
					x = x * i;

				}
			}

		}
	}

	static void primeFactorr(int n) {
		if (n <= 1) {
			return;
		}
		for (int i = 2; i * i < n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		if (n > 1) {
			System.out.println(n);
		}
	}

	static void primeFactorrs(int n) {
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
		for (int i = 5; i * i < n; i += 6) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			while (n % (i + 2) == 0) {
				System.out.println(i + 2);
				n = n / (i + 2);
			}
		}
		if (n > 3) {
			System.out.println(n);
		}
	}
	
	static void primeff(int n) {
		for (int i = 2; i < n; i++) {
			if (prime(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.print(i);
					x = x * i;

				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		primeFactor(n);
	
		
	}

}
