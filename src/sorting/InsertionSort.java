package sorting;

public class InsertionSort {

	static void iSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	static void insertionSort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;

		}
	}

	static void insertionSortss(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 50, 20, 40, 60, 10, 30 };

		int n = arr.length;
		iSort(arr);

		for (int x : arr)
			System.out.print(x + " ");

	}

}
