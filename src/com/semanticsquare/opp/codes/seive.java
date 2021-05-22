package com.semanticsquare.opp.codes;

import java.util.Arrays;

public class seive {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
