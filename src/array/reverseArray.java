package array;

import java.util.ArrayList;
import java.util.List;

public class reverseArray {

	static void reverseArray(int[] a) {
		int high = a.length - 1;
		int low = 0;
		while (low < high) {
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
	
	}
	
	static void rev(int[] a) {
		int res = 0 ; 
		for(int i = a.length - 1; i < a.length ; i --) {
			int temp = a[i];
			a[i] = a[res];
			a[res] = temp;
			res ++ ;
		}
		for(int  i = 0; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
	}

///ARRAY LIST <MOFIFIED SOLUTIOMN
	static void reverseArray1(int[] a) {
		for (int i = 0; i < (a.length / 2); i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;

		}
		System.out.println("Reversed Array  ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
 
	
	 
	/// ARRAY LIST SOLUTION HACKWERRANK
	public static ArrayList<Integer> reverse(ArrayList<Integer> a) {

		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int i = a.size() - 1; i >= 0; i--) {
			newArray.add(a.get(i));
		}
		for (int i = 0; i < newArray.size(); i++) {
			System.out.println(newArray.get(i));
		}
		return newArray;

	}
	
	public static ArrayList<Integer> left(ArrayList<Integer> a , int d) {
		
		while(d!=0) {
			a.add(a.get(0));
			d--;
		}
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 30, 5, 6, 8, 79, 12 };
		rev(arr);
		

	}

}
