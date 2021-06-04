package array;

public class StockBuySell {

	static int maxProfit(int[] a, int start, int end) {
		if (end <= start) {
			return 0;

		}
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (a[j] > a[i]) {
					int curr_profit = a[j] - a[i] + maxProfit(a, start, i - 1) + maxProfit(a, j + 1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;
	}

	// Another solution to this problem
	// here we do not make sell at low only sell at high

	static int profit(int[] a) {
		int n = a.length;
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] > a[i - 1]) {
				profit += a[i] - a[i - 1];
			}
		}
		return profit;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 3, 8, 12 }, n = 5;

		System.out.println(profit(arr));

	}

}
