package array;

public class MinAndMax {
	static void minMax(int[] a) {
		int n = a.length;
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < n; i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 34, 65, 34, 1 };
		minMax(a);
	}

}
