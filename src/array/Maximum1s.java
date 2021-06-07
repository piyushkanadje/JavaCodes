package array;

public class Maximum1s {
	// naive solution
	static int maxConsecutiveOnes(int[] a) {
		int res = 0;

		int n = a.length;

		for (int i = 0; i < n; i++) {

			int count = 0;
			for (int j = i; j < n; j++) {
				if (a[j] == 1) {
					count++;

				} else {

					break;

				}
			}
			res = Math.max(res, count);

		}
		return res;

	}
	// efficient solution

	static int maximumconsecative(int[] a) {
		int res = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count = 0;
			} else {
				count++;
				res = Math.max(count, res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 1, 1,0, 1, 1 }, n = 7;

		System.out.println(maximumconsecative(arr));
	}

}
