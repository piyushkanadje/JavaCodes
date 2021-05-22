package com.semanticsqure.opp.gfg;

import java.util.Arrays;

public class Geek {

	static int countDigit(long n) {
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

	static boolean palin(int n) {
		int rev = 0;
		int temp = n;
		while (temp != 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp / 10;

		}
		return (rev == n);

	}

	static int facto(int n) {
//	 
//		  int res = 1;
//		for (int i = 2; i <= n; i++) {
//           res = res * i;
//		}
//		return res;
		if (n == 0) {
			return 1;
		}
		return n * facto(n - 1);
	}

	static int traiCount(int n) {
		int num = facto(n);
		int res = 0;
		while (num % 10 == 0) {
			res++;
			num = num / 10;
		}
		return res;
	}

	static int train(int n) {
		int res = 0;
		for (int i = 5; i <= n; i = i * 5) {
			res = res + n / i;

		}
		return res;
	}

	static int div(int n) {
		int x = n;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (x % i == 0) {
				count++;
				System.out.println(i);
			}
		}
		return count;
	}

	static int gcd(int a, int b) {
		int res = Math.min(a, b);
		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				break;
			}
			res--;

		}

		return res;
	}

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

	static int gcdEO(int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcdEO(b, a % b);
	}

	static int lcm(int a, int b) {
		return (a * b) / gcdEO(a, b);
	}

	static boolean idPrime(int n) {
		if (n == 1) {
			return false;

		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean primeNumber(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

//	static boolean isPrimee(int n) {
//		if (n == 1) {
//			return false;
//
//		}
//		if (n == 2 || n == 3) {
//			return true;
//		}
//		if (n % 2 == 0 || n % 3 == 0) {
//			return false;
//		}
//
//		for (int i = 5; i * i  <= n; i += 6) {
//			if (n % i == 0 && n % (i + 2) == 0) {
//				return false;
//			}
//		}
//		return true;
//
//	}
//
	static void primeFactor(int n) {
		for (int i = 2; i < n; i++) {

//			if (primeFactorr(i)) {
			int x = i;
			while (n % x == 0) {
				System.out.println(i);
				x = x * i;

			}
		}

	}
//	}

	static void primeFE(int n) {
		if (n <= 1) {
			return;
		}

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		if (n > 1) {
			System.out.println(n);
		}
	}

	static void primeEE(int n) {
		if (n <= 1) {
			return;
		}
		while (n % 2 == 0) {
			System.out.println("2");
			n = n / 2;
		}
		while (n % 3 == 0) {
			System.out.println("3");
			n = n / 3;

		}
		for (int i = 5; i * i <= n; i += 6) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			while (n % (i + 2) == 0) {
				System.out.println(i);
				n = n / i;
			}
		}

	}

	static void printDivisors(int n) {
//		int i;
//		for (i = 1; i * i < n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//			}
//		}
//		for (; i >= 1; i--) {
//			if (n % i == 0) {
//				System.out.println(n / i);
//
//			}
//		}
//		for(int i = 1 ; i<=n ;i++) {
//			if(n % i ==0) {
//				System.out.println(i);
//			}
//		}

		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);

				if (i != n / i) {

					System.out.println(n / i);
				}

			}

		}
	}

	static boolean primeNo(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void printN(int p) {
		for (int n = 2; n < p; n++) {
			if (n == 2 || n == 3 || n == 5 || n == 7) {
				System.out.println(n);
			}

			if (n % 2 == 0) {
				return;
			}
			if (n % 3 == 0) {
				return;
			}
			if (n % 5 == 0) {
				return;
			}
			System.out.println(n);
		}

	}

	static void sieve(int n) {
		if (n <= 1)
			return;

		boolean isPrime[] = new boolean[n + 1];

		Arrays.fill(isPrime, true);

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = 2 * i; j <= n; j = j + i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i])
				System.out.print(i + " ");
		}
	}

	static int power(int x, int n) {
		int res = 1;
		if (n == 0) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			res = res * x;
		}
		return res;
	}

	// power optimise

	static int pow(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int temp = pow(x, n / 2);
		temp = temp * temp;
		if (n % 2 == 0) {
			return temp;
		} else {
			return temp * x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4568;

		// System.out.println(countDigit(number));
		// System.out.println(palin(131));
		// System.out.println(primeFactor(8));
		// primeFactor(450);
		// printDivisors(25);
		// primeEE (450);
		// System.out.println(primeFactor(25));
		// printN(10);
		System.out.println(pow(10 , 2));

	}

}
