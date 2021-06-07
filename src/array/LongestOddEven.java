package array;

public class LongestOddEven {

	// Naive Solution
	static int maxEvenOdd(int[] a) {
		int res = 1;
		for (int i = 0; i < a.length; i++) {
			int curr = 1;
			for (int j = i + 1; j < a.length; j++) {
				if ((a[j] % 2 == 0 & a[j - 1] % 2 != 0) || (a[j - 1] % 2 == 0 && a[j] % 2 != 0)) {
					curr++;

				} else {
					break;
				}
				res = Math.max(curr, res);
			}

		}
		return res;
	}

	// Efficient solution

	static int maxEvenOdd1(int[] a) {
		int res = 1;
		int curr = 1;
		for (int i = 1; i < a.length; i++) {
			if ((a[i] % 2 == 0 && a[i - 1] % 2 != 0) || (a[i] % 2 != 0 && a[i - 1] % 2 == 0)) {
				curr++;
				res = Math.max(curr, res);
			} else {
				curr = 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 10, 20, 6, 3, 8 }, n = 6;

		System.out.println(maxEvenOdd1(arr));
	}

}
