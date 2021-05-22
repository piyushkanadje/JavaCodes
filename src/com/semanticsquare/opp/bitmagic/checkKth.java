package com.semanticsquare.opp.bitmagic;

public class checkKth {

	
	// by lefy shiftoperator in which we left shift the 1 by (k- 1) time and then
	// and it with n
	static void check(int n, int k) {
		if ((n & (1 << (k - 1))) != 0) {
			System.out.println("Yes it is set");
		} else {
			System.out.println("It is Not Set");
		}
	}

	// using right shift here we right shit the number by (k-1) times and equals
	// with 1
	static void checkR(int n, int k) {
		if ((n >> (k - 1) & 1) == 1) {
			System.out.println("Yes it is set");
		} else {
			System.out.println("It is Not Set");
		}

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		check(5, 1);
		checkR(5, 1);
	}

}
