package array;

public class Search {
	static boolean search(int[] arr, int ele) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == ele) {
				System.out.println(ele);
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 23, 56, 15 };
		System.out.println(search(arr,15 ));
	}

}
