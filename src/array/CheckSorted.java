package array;

public class CheckSorted {

	// naive method
	static boolean checkSorted(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] < a[i]) {
					return false;
				}
			}
		}
		return true;

	}

	// efficient method
	static boolean checkSort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 10, 10 };
		System.out.println(checkSort(a));
	}
}
