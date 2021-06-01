package recursion;

public class StringSubset {
	// power sets of a string
	[]

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
