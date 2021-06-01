package com.semanticsquare.opp.codes;

import java.util.*;

public class StringReverse {
//	public static  void revserse(String s) {
//		 String input = "Geeks for Geeks";
//		 
//	        StringBuilder input1 = new StringBuilder();
//	 
//	        // append a string into StringBuilder input1
//	        input1.append(input);
//	 
//	        // reverse StringBuilder input1
//	        input1.reverse();
//	 
//	        // print reversed String
//	        System.out.println(input1);
//	}

	public static void main(String[] args) {
	
		String A = "madam";
		int count = 0;
		for(int i = 0 ; i < A.length()/2 ; i ++) {
			if(A.charAt(i) == A.charAt(A.length()-i-1)) {
				count ++ ;
				
			}
			
		}
		System.out.println((count == A.length()/2 ? "Yes" : "No"));
		
		//Another Way
		
//		System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
//			    ? "Yes" : "No" );
	
	}

}
