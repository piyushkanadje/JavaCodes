package array;

public class MajorityOfElements {
	static int findMajority(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}

			}
			if (count > n / 2) {
				return i;
			}
		}
		return -1;
	}

	// Moorish Voting Algorithm

	static int findMajority1(int[] a) {
		int res = 0;
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[res] == a[i]) {
				count++;

			} else {
				count--;
			}
			if (count == 0) {
				res = i;
				count = 1;
			}
		}
		count = 0;

    	for(int i = 0; i < a.length; i++)
    		if(a[res] == a[i])
    			count++;

    	if(count <=a.length/2)
    		res = -1;

    	return res;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 }, n = 8;

		System.out.println(findMajority(arr));
	}

}
