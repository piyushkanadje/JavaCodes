package sorting;

public class selectionSort {
	static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int min_ind = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_ind]) {
					min_ind = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
		}

	}

	public static void selectionSorts(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min_val = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min_val]) {
					min_val = j;
				}
			}
			int temp = a[i];
			a[i] = a[min_val];
			a[min_val] = a[i];

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 1, 4, 3 };
		selectionSort(a);

		for (int i = 0; i < 4; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
