package sorting;

public class bubbleSort {
	// Supernaive Bubble sort
	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	// naived solution
	public static void bubbleSortNaive(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static void bubbleSortOptimised(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped) {
				break;
			}
		}

	}

	public static void bubbleSortS(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped) {
				break;
			}
		}
	}

	static void Bubble(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean swapped = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
				if (swapped) {
					break;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 1, 4, 3 };
		bubbleSortOptimised(a);

		for (int i = 0; i < 4; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
