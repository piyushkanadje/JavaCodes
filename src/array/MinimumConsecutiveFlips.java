package array;

public class MinimumConsecutiveFlips {
	static void printGroups(int a[]) {

		for (int i = 1; i < a.length; i++) {

			if (a[i] != a[i - 1]) {

				if (a[i] != a[0]) {

					System.out.print("Flip From " + i + " to ");

				} else {

					System.out.println(i - 1);

				}

			}

		}
		if (a[a.length - 1] != a[0]) {

			System.out.print(a.length - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 0 }, n = 9;
		printGroups(arr);
	}

}
