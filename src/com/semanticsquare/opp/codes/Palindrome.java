package com.semanticsquare.opp.codes;
public class Palindrome {
	// Reverse Of the number
	static boolean palindromes(int n) {
		int rev = 0;
		int temp = n;
		while (temp != 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp / 10;

		}
		return (rev == n);
	}

	//String PAalimdrome
	public static void rev(String str) {
		String input =  str ;
		StringBuilder input1 = new StringBuilder();
		
		
		input1.append(input);
		System.out.println(input1.reverse());
		
		System.out.println( input.equals( input1.reverse().toString()) ? "True" : "False"  );
		
	
	}
	
	//Anagrams Of Strings

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		
		String S = "madam";
//		int sr = S.length();
//		System.out.println(S.charAt(0));
rev(S);
		

	}

}
