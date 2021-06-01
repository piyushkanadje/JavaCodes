package recursion;

public class palindrome {
	// palindrome of number
	static boolean pali(int n) {
		if (n == 0 || n == 1) {
			return true;
		}
		int res = 0;
		int x = n;
		while (x > 0) {
			int ld = x % 10;
			res = res * 10 + ld;
			x = x / 10;
		}
		return (res == n);
	}

//palidrome of string 
	// static boolean( String str , int start = 0; , int end=n-1) {
	static boolean isPalindrome(String str, int start, int end) {
		if (start >= end) {
			return true;
		}

		return (str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1));

	}
	
	

//rope cutting
//	static int ropeC(int n, int a, int b, int c) {
//		if (n == 0) {
//			return 0;
//		}
//		if (n < 0) {
//			return -1;
//		}
//		int res = Math.max((ropeC(n - a, a, b, c)), Math.max(ropeC(n - b, a, b, c), ropeC(n - c, a, b, c)));
//		if (res == -1) {
//			return -1;
//		}
//		return res + 1;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		int n = 9, a = 2, b = 2, c = 2;

	}

}
