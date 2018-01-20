package indi.ycl.main;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		
		return nums[nums.length/2];

	}
}
