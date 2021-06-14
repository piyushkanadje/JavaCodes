package Searching;

public class squarRoot {
//naive Solution
	static int naiveSquareRoot(int x) {
		int i = 0;
		while (i * i < x) {
			i++;
		}
		// int root = (int) Math.sqrt(x);
		return (i - 1);
	}

//effective soln using Binary Search
	static int binarySquareRoot(int x) {
		int ans = -1;
		int low = 1;
		int high = x;
		while (low <= high) {
			int mid = (low + high) / 2;
			int mSq = mid * mid;
			if (mSq == x) {
				return mid;
			} else if (mSq > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}

	// effective practice
	static double practice(int x) {
		double ans = -1;
		int low = 0;
		int high = x;
		while (low <= high) {
			int mid = (low + high) / 2;
			int msq =mid * mid;
			if (msq == x) {
				return mid;
			} else if (msq > x) {
				high = mid - 1;
			} else {
				ans = mid;
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 14;
		double a = practice(x);
		System.out.println(a);
	}

}
