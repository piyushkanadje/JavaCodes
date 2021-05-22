package recursion;

public class RopeCutting {

	
	/// rope problem
	static int ropeP(int n, int a, int b, int c) {
		if (n == 0) {
			return 0;

		}
		if (n < 0) {
			return -1;
		}
		int res = Math.max(ropeP(n - a, a, b, c), Math.max(ropeP(n - b, a, b, c), ropeP(n - c, a, b, c)));

		if (res == -1) {
			return -1;
		}

		return res + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		//set(s);
		
	int n = 5, a = 2, b = 1, c = 5;
    	
    	System.out.println(ropeP(n, a, b, c));
		
		
	}

}
