package recursion;

public class TowerOfHanoi {

	static void tower(int n, char a, char b, char c) {
		if (n == 1) {
			System.out.println("Move 1 From " + a + " to " + c);
			return;
		}
		tower(n - 1, a, c, b);
		System.out.println("Move " + n + " from " + a + " to " + c);
		tower(n - 1, b, a, c);
	}

	static void towe(int n, char a, char b, char c) {
		if (n == 1) {
			System.out.println(" MOve 1 from " + a + "to " + c);
			return;
		}
		towe(n - 1, a, c, b);
		System.out.println("Move " + n + "from " + a + "to" + c);
		towe(n - 1, b, a, c);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		towe(n, 'A', 'B', 'C');
	}

}
