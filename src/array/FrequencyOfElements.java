package array;

public class FrequencyOfElements {
	// to check frequency of sorted elements

	static void frequency(int[] arr) {
		int n = arr.length;
		int i = 1;
		int freq = 1;
		
		while (i < n) {
			while (i < n && arr[i] == arr[i - 1]) {
				freq++;
				i++;
			}

			System.out.println(arr[i - 1] + " " + freq);

			i++;
			freq = 1;
		}
		if(n == 1){
    	    System.out.println(arr[n-1]  + " " + 1);
    	}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10};
		frequency(a);
	}

}
