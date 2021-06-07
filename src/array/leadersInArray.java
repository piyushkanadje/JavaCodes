package array;

import java.util.ArrayList;

public class leadersInArray {

	// the solution using n square time

	static void leader(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = i + 1; j < n; j++) {
				if (a[i] <= a[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(a[i]);
			}
		}
	}
	
	
	// using 1 iteration
	static void leaderN(int[] a) {
		int n = a.length;
		int curr_leader = a[n - 1];
		System.out.println(curr_leader);
		for (int i = n - 2; i >= 0; i--) {
			if ( a[i] > curr_leader ) {
				curr_leader = a[i];
			System.out.println(curr_leader);
			}
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 10, 4, 10, 6, 5, 3 };
		leaderN(a);

	}

}
