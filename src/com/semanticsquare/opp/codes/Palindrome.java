package com.semanticsquare.opp.codes;

import java.util.Calendar;
import java.util.Scanner;

public class Palindrome {
	// Reverse Of the number
	static boolean palindrome(int n) {
		int rev = 0;
		int temp = n;
		while (temp != 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp / 10;

		}
		return (rev == n);
	}

//	static boolean palindrom(int n) {
//		int rev = 0;
//		int temp = n;
//		while (temp != 0) {
//           int ld = temp % 10 ;
//           rev  = rev  * 10 + ld;
//            temp = temp /10;
//           
//		}
//		return ( rev == n);
//	}

	static boolean palindromew(int n) {
		int rev = 0;
		int temp = 0;
		while (temp != 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp / 10;

		}
		return(rev==n);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		// System.out.println(palindrome(121));
		// System.out.println(palindrom(121));
		// System.out.println(powo(5, 2));
		System.out.println(palindromew(53));
		
		String S = "Lob";
		int sr = S.length();
		System.out.println(S.charAt(0));
		
//		Scanner sc = new Scanner(System.in);
//		String S  = sc.nextLine();
//		
		
	}

}
