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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 14;
		int a = binarySquareRoot(x);
		System.out.println(a);
	}

}
