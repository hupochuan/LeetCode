package indi.ycl.main;

import java.util.Arrays;

public class LargestNumberGreaterThanTwiceofOthers {
	public int dominantIndex(int[] nums) {
		if (nums == null || nums.length < 2) {
            return -1;
        }
        // find max
        int max = Integer.MIN_VALUE;
        int largest = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                largest = i;
            }
        }
        // check max is more than twice as big as x
        for (int  i = 0; i < nums.length; i++) {
            if (nums[i]*2 > max && i != largest) {
                return -1;
            }
        }
        
        
        return largest;
	}

}
