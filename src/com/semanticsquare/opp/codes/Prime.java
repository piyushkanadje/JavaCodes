package com.semanticsquare.opp.codes;

public class Prime {
	/**
	 * @param n
	 * @return
	 */
	static boolean prime(int n) {
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

	// Divisors always came in pairs so O(root n ) ;  
	static boolean primee(int n ) {
		if(n == 1) {
			return false;
		}
		for(int i= 2 ; i *i<=n ;i++) {
			if(n %i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//optimise
	//TO remember
	static  boolean primeO(int n) {
		if(n == 1) {
			return false;
		}
		if(n == 3 ||n  == 2) {
			return false ;
			
		}
		if(n % 2 ==0 || n %3 == 0) {
			return false;
		}
		for(int i = 5; i *i <= n ; i+= 6) {
			if(n%i == 0 || n % (i+2) == 0) {
				return false;
			}
		}
		
		return true ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeO(20));
	}

}
