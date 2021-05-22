package com.semanticsquare.opp.bitmagic;

public class PowerSet {

	

	static void powerSetOFString(String str) {
		int n = str.length();
		int powerSet = (int) Math.pow(2, n);
		for (int counter = 0; counter < powerSet; counter++) {
			for (int j = 0; j < n; j++) {
				if ((counter & (1 << j)) != 0) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerSetOFString("abc");

	}

}
