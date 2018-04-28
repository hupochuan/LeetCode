package indi.ycl.medium;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElementsII_462 {
	public int minMoves2(int[] nums) {
		Arrays.sort(nums);
		int i=0,j=nums.length-1,sum=0;
	    while(i<j){
			sum+=nums[j]-nums[i];
			i++;
			j--;
		}
		return sum;

	}
}
