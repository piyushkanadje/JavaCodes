package com.semanticsquare.opp.codes;

import java.util.Arrays;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
        // Complete the function
       char c1[] = a.toCharArray();
       char c2[]= b.toCharArray();
       
       int n1 = c1.length;
       int n2 = c2.length;
       if(n1 != n2) {
    	   return false ; 
       }
       
       Arrays.sort(c1);
       Arrays.sort(c2);
       for(int i =0 ; i < n1  ; i++) {
    	   if(c1[i] != c2[i]) {
    		   return false;
    	   }
       }
       
       
       
       return  true;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  a = "cat";
		String b ="tac";
 System.out.println(isAnagram( a,  b));
	}

}
