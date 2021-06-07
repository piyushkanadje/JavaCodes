package array;

public class RemoveDuplicate {
	// naive methiod

	static int remDups(int arr[], int n) {
		int temp[] = new int[n];

		temp[0] = arr[0];

		int res = 1;

		for (int i = 1; i < n; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}

		for (int i = 0; i < res; i++) {
			arr[i] = temp[i];
		}

		return res;
	}

	

	// efficient method
	static int remDups1(int arr[], int n)
    {
    	int res = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res - 1] != arr[i])
    		{
    			arr[res] = arr[i];
    			res++;
    		}
    	}

    	return res;
    }

	public static void main(String args[]) {
//		int arr[] = { 10, 20, 20, 30, 30, 30 }, n = 6;
//
//		System.out.println("Before Removal");
//
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//
//		System.out.println();
//
//		n = remDups(arr, n);
//		int r = removeDuplicate(arr);
//
//		System.out.println("After Removal");
//
//		for (int i = 0; i < r; i++) {
//			System.out.print(arr[i] + " ");
//		}

		int a[] = { 1, 2, 3, 0, 0, 3, 8, 3, 4 };
		removeXero(a);

	}

}
