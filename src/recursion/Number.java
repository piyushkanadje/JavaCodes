package recursion;

public class Number {

	// n to 1 .. 4 3 2 1
	static void printN(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		printN(n - 1);
	}

	// from 1 2 3 4 5
	static void printU(int n) {
		if (n == 0)
			return;
		printU(n - 1);
		System.out.println(n);
	}

	// convert above in tail recursive print 1 2 3 4 5

	static void tailRecursive(int n, int k) {
		if (n == 0)
			return;
		System.out.println(k);
		tailRecursive(n - 1, k + 1);
	}

	// factorial recursive
	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);

	}

	// tail recursive factorial k = 1
	static int taiFact(int n, int k) {
		if (n == 0 || n == 1) {
			return k;
		}
		return taiFact(n - 1, k * n);
	}

	// fibannachi
	static int sun(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return (n - 1) + sun(n - 2);
	}

	

	// sum of n numbers
	static int summ(int n) {
		if (n == 0) {
			return 0;
		}

		// sum = sum + summ(n - 1);
		return n + summ(n - 1);
	}

	// sum of digit in number
	static int sum(int n) {
		if (n == 0) {
			return n;
		}
		int res = 0;
		while (n > 0) {
			int ld = n % 10;
			res = res + ld;
			n = n / 10;
		}
		return res;
	}

	// sum of recursive
	static int sumR(int n) {
		if (n == 0) {
			return 0;

		}

		return (n % 10 + sumR(n / 10));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printN(5);
		// tailRecursive(5, 1);
		// System.out.println(sumR(253));
		String s = "aba";

	}

}
