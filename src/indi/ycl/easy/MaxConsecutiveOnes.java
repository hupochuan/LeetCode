package indi.ycl.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {  };
		new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);

	}

	// 用队列吧
	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (num == 1) {
				count++;

				if (i == nums.length - 1 && max < count) {

					max = count;
				}

			}

			if (num == 0){
				if(count > max ){
					max = count;
				
				}

				count = 0;

			}
		}
		return max;

	}
	
	public int findMaxConsecutiveOnes1(int[] nums) {
		int max=0,maxHere=0;
		for (int i : nums) {
			max=Math.max(max, maxHere=i==0?0:maxHere++);
			
		}
		return max;
	}

}
