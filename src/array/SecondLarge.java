package array;

public class SecondLarge {

	static int getLargest(int[] a) {
		int largest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[largest]) {
				largest = i;
			}
		}
		return largest;
	}

	// find ans in 2 iteration
	static int sencondLargest(int[] a) {
		int largest = getLargest(a);
		int res = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[largest]) {
				if (res == -1) {
					res = i;
				} else {
					if (a[i] > a[res]) {
						res = i;
					}
				}
			}
		}
		return a[res];
	}

	// finding ans in single traversal
	static int sec(int[] a) {
		int largest = 0;
		int res = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[largest]) {
				res = largest;
				largest = i;
			} else if (a[i] != a[largest]) {
				if (res == -1 || a[i] > a[res]) {
					res = i;
				}
			}
		}
		return a[res];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 12, 30 };
		System.out.println((a));
	}

}
