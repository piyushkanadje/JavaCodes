package leetcode;

public class twoSum {

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int currNum = nums[i];
			for (int j = i+i; j < nums.length; j++) {
				if (currNum + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		return new int[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		twoSum(nums, 17);
        int[] n = twoSum(nums, 17);
        for(int i = 0; i < n.length ;i++) {
        	System.out.println(n[i]);
        }
        
	}

}
