package recursion;

public class StringSubset {
	// power sets of a string
	static void set(String s) {
		int n = s.length();
		int powerset = (int) Math.pow(2, n);
		for (int counter = 0; counter < powerset; counter++) {
			for (int j = 0; j < n; j++) {
				if ((counter & (1 << j)) != 0) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

	// power sets using recursion

	static void subSets(String s, String curr, int index) {
		if (index == s.length()) {
			System.out.println(curr);
			return;
		}

		subSets(s, curr, index + 1);
		subSets(s, curr + s.charAt(index), index + 1);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String curr = "";
		int index = 0;
		// set(s);
		subset(s);

	}

}
