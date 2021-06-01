package array;

import java.util.ArrayList;
import java.util.List;

public class leftByONE {
	static void leff(int[] a) {
		int n = a.length;
		int temp = a[0];
		for (int i = 1; i < n; i++) {
			a[i - 1] = a[i];

		}
		a[n - 1] = temp;

	}
	
	// naive method to left rotate by d
	static void leftD(int[] a, int d) {
		for (int i = 0; i < d; i++) {
			leff(a);
		}
	}

	// better method to rotate

	static void leftRotate(int[] a, int d) {
		int[] temp = new int[d];
		int n = a.length;
		for (int i = 0; i < d; i++) {
			temp[i] = a[i];
		}
		for (int i = d; i < a.length; i++) {
			a[i - d] = a[i];
		}
		for (int i = 0; i < d; i++) {
			a[n - d + i] = temp[i];
		}
	}

 
	
	static void leftDg(int[] a ,int d) {
		int[] temp = new int[d];
		int n = a.length;
		for(int i = 0 ; i < d ; i++) {
			temp[i] = a[i];
		}
		for(int i =d ; i <n ; i++ ) {
			a[i-d] = a[i];
		}
		for(int i  = 0 ; i < d ; i ++) {
			a[n - d + i  ] = temp[i];
		}
		
	}
	
	//Left Rotate Integer Array List
    public static List<Integer> leftRotate(List<Integer> a , int d){
    	 
    	while(d !=0) {
    		a.add(a.remove(0));
    		d--;
    	}
    	
    	return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 20, 30 };
		leftDg(arr, 4);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(12);
		a.add(23);
		a.add(433);
		leftRotate(a , 2);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
