package indi.ycl.main;

public class LongestContinuousIncreasingSubsequence674 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		int maxlen=1,curlen=1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>nums[i-1]){
				curlen++;
			}else{
				maxlen=Math.max(maxlen, curlen);
				curlen=1;
			}
		}
		
		return Math.max(maxlen, curlen);
	}
	
	//更简洁的办法
	public int findLengthOfLCIS1(int[] nums) {
		if (nums.length == 0)
			return 0;
		int maxlen=1,curlen=1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]>nums[i-1]){
				maxlen=Math.max(maxlen, curlen++);
			}else{
				curlen=1;
			}
		}
		
		return maxlen;
	}
}
