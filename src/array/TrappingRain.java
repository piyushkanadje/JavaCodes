package array;

public class TrappingRain {

	static int trappingRain(int[] a) {
		int n = a.length;
		int res = 0;
		for (int i = 1; i < n - 1; i++) {
			int lmax = a[i];
			for (int j = 0; j < i; j++) {
				lmax = Math.max(lmax, a[j]);
			}
			int rmax = a[i];
			for (int j = i + 1; j < n; j++) {
				rmax = Math.max(rmax, a[j]);
			}
			res = res + (Math.min(lmax, rmax) - a[i]);

		}
		return res;
	}

	static int rain(int[] a) {
		int res = 0;
		int n = a.length;
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		lmax[0] = a[0];
		for (int i = 1; i < n; i++) {
			lmax[i] = Math.max(a[i],lmax[i-1]);
		}
		rmax[0] = a[n-1];
		for(int i = n-2 ; i >=0 ; i--) {
		rmax[i]= Math.max(a[i],rmax[i+1]);	
		}
		for(int i = 1; i < n - 1; i++) {
			res = res + (Math.min(lmax[i], rmax[i]) - a
					
					
					[i]);
		}
    		
    	
    	return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 0, 1, 2, 5 };
		int n = rain(arr);
		System.out.println(n);
	}

}
