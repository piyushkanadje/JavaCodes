package Searching;

public class MajorityOfElement {
	// Moorish Voting Algorithm
	static int findMajority(int arr[]) {
		int res = 0, count = 1;
		int n= arr.length;

		for (int i = 1; i < n; i++) {
			if (arr[res] == arr[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				res = i;
				count = 1;
			}
		}

		count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[res] == arr[i]) {
				count++;
			}
		}

		if (count <= n / 2) {
			res = -1;
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 7,6,6, 6, 8, 6, 6, 6, 6 }, n = 8;

		System.out.println(findMajority(arr));
	}

}
