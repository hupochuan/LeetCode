package indi.ycl.easy;

public class MaximumAverageSubarrayI_643 {
	public double findMaxAverage(int[] nums, int k) {
		int sum=0;
		for (int i = 0; i < k; i++) {
			sum+=nums[i];
		}
		int maxSum=sum;
		for (int i = k; i < nums.length; i++) {
			maxSum=Math.max(maxSum, sum+nums[k]-nums[i-k]);
		}
		
		return maxSum*1.0/k;

	}

}
