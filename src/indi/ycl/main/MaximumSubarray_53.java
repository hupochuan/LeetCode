package indi.ycl.main;

public class MaximumSubarray_53 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSubArray(new int[]{-2,1}));
	}
	public static int maxSubArray(int[] nums) {
		int currentMax=nums[0];
		int generalMax=nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentMax=Math.max(nums[i], currentMax+nums[i]);
		
			generalMax=Math.max(currentMax, generalMax);
			
		}
		
		return generalMax;
	}

}
