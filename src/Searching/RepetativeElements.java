package Searching;

public class RepetativeElements {
	static int repeat(int arr[]) {
		int n = arr.length;
		boolean visit[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (visit[arr[i]])
				return arr[i];
			visit[arr[i]] = true;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 2, 1, 3, 2, 2 };

		System.out.println(repeat(arr));
	}

}
