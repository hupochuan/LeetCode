package indi.ycl.easy;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int singleNumber(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[0]^=nums[i];
		}
		return nums[0];

	}

}
