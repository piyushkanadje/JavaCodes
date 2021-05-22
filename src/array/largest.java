package array;

public class largest {

	static int largest(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (a[j] > a[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				return a[i];
			}
		}
		return -1;
	}

	// using single travesal
	static int largests(int[] a) {
		int res = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[res]) {
				res = i;
			}
		}
		System.out.println(a[res]);

		return a[res];
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 50 ,90 };
		System.out.println(checkIn(arr));
		largests(arr);
	}

}
