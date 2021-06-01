package com.semanticsquare.opp.codes;

public class LCM {
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);

	}

	static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcm(15, 20));
		System.out.println(lcmd(15, 20));
	}

}
