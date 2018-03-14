package indi.ycl.medium;

public class SingleElementinaSortedArray_540 {
	public int singleNonDuplicate(int[] nums) {
		int index=0;
		while(index<=nums.length-2){
			if((nums[index]^nums[index+1])!=0)
				return nums[index];
			index+=2;
		}
		return nums[nums.length-1];

	}

}
