package indi.ycl.main;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1};
		new MoveZeroes().moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public void moveZeroes(int[] nums) {
	
		int cnt=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0)
				cnt++;
			else
				nums[i-cnt]=nums[i];
		}
	
		for (int i = nums.length-1; i >nums.length-1-cnt; i--) {
			nums[i]=0;
			
		}
		
	

	}

}
