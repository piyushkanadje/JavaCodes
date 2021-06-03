package array;

public class Delete {
	static int delete(int[] arr, int ele) {
		int n = arr.length;
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] == ele) {
				break;
			}
			if (i == n) {
				System.out.println("Element is not found");
				return n;
			}

		}
		for (int j = i; j < n - 1; j++) {
			arr[j] = arr[j + 1];

		}
		n = n - 1;

		System.out.println("Elements after delete");
		for (int k = 0; k < n; k++) {
			System.out.print(arr[k] + " ");
		}
		return n;

	}
	//Update the elements in an array
	static int update(int[] a, int pos, int ele) {
		int n = a.length;
		int index = pos - 1;
		if (index > n) {
			System.out.println("Position is not there ");
		}
		a[index] = ele;
		System.out.println("Updated elements");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		return n;
	}

	public static void main(String args[]) {
		int arr[] = new int[5];
		arr[0] = 20;
		arr[1] = 30;
		arr[2] = 40;
		System.out.println(delete(arr, 2));
	}
}
