package array;

import java.util.ArrayList;

public class Insert {
	static int insert(int arr[], int n, int x, int cap, int pos) {
		if (n == cap)
			return n;

		int idx = pos - 1;
		for (int i = n - 1; i >= idx; i--) {
			arr[i + 1] = arr[i];
		}

		arr[idx] = x;
		n = n + 1;
		System.out.println("NEw array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		return n;

	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5], cap = 5, n = 3;
		// ArrayList<Integer> al = new ArrayList<Integer>(cap);
		arr[0] = 5;
	   System.out.println(insert(arr,n,2,cap,1));
		

//		al.add(20);
//		al.add(23);
//		al.add(65);
//
//		System.out.println(al.get(0));
	}
}
