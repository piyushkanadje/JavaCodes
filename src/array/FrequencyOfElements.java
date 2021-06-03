package array;

public class FrequencyOfElements {
	// to check frequency of sorted elements
	static void printFreq(int arr[]) {
		int n = arr.length;
		int freq = 1, i = 1;

		while (i < n) {
			while (i < n && arr[i] == arr[i - 1]) {
				freq++;
				i++;
			}

			System.out.println(arr[i - 1] + " " + freq);

			i++;
			freq = 1;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10, 10, 30 };
		printFreq(a);

	}

}
