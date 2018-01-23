package indi.ycl.main;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int l=nums.length;
		return nums[l-1]*nums[l-2]*nums[l-3]>nums[0]*nums[1]*nums[2]?nums[l-1]*nums[l-2]*nums[l-3]:nums[0]*nums[1]*nums[2];

	}

}
