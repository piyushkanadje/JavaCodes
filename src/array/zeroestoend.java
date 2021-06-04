package array;

public class zeroestoend {

	public static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
		// System.out.println("Swap done " + a[x] + " " + a[y]);

	}

	static void zeroes(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				for (int j = i + 1; j < n; j++) {
					if (a[j] != 0) {
						swap(a, i, j);
					}

				}
			}
		}

	}



	// efficient solution

	static void moveZero(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				swap(a, i, count);
				count++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 4, 6, 67, 7, 0, 4, 5, 0, 0, 0 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

	}

}
