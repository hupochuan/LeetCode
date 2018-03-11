package indi.ycl.easy;

public class SetMismatch_645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] findErrorNums(int[] nums) {
		int dup=0;
		int mis=0;
		for (int i = 0; i < nums.length; i++) {
			int abs=Math.abs(nums[i]);
			if(nums[abs-1]>0){
				nums[abs-1]=-nums[abs-1];
			}else{
				dup=Math.abs(nums[i]);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0){
				mis=i+1;
			}
		}
		return new int[]{dup,mis};
		

	}

}
