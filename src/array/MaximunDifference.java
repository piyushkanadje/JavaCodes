package array;

public class MaximunDifference {

	// solution taking O n square
	static int maxdiff(int[] a) {
		int n = a.length;
		int res = a[1] - a[0];
		for (int i = 0; i < n; i++) {
			for (int j = i + i; j < n; j++) {
				res = Math.max(res, a[j] - a[i]);
			}
		}
		return res;
	}

//solution taking O n as timecomplexity
	static int maxD(int[] a) {
		int n = a.length;
		int res = a[1] - a[0];
		int minVal = a[0];
		for (int j = 1; j < n; j++) {
			res = Math.max(res, a[j] - minVal);
			minVal = Math.min(minVal, a[j]);
		}
		return res;
	}
	
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 30, 10, 6, 4, 8, 1 };
	}

}
