package sorting;

public class InsertionSort {
	static void insertionSort(int[] a) {
		int n = a.length;

		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int key = a[i];
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
		insertionSoret(arr);

		for (int x : arr)
			System.out.print(x + " ");
	}

}
