package indi.ycl.medium;

public class MinimumMovestoEqualArrayElementsII_462 {
	public int minMoves2(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		int ave=sum/nums.length;
		
		int move=0;
		for (int i = 0; i < nums.length; i++) {
			move+=Math.abs(nums[i]-ave);
		}
		return move;

	}
}
