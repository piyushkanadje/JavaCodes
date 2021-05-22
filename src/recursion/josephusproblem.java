package recursion;

public class josephusproblem {
///starting position is 0
	static int jos(int n, int k) {
		if (n == 1) {
			return 0;
		}
		return ((jos(n - 1, k) + k) % n);
	}

//starting position is 1 
	static int myJos(int n, int k) {
		return jos(n, k) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myJ os(5, 2));
	}

}
