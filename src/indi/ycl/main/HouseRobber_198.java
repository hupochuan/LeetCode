package indi.ycl.main;

public class HouseRobber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rob(int[] nums) {
		int[][] dp=new int[nums.length+1][2];
		int preYes=0,preNo=0;
		for (int i = 1; i < dp.length; i++) {
			dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]);
			dp[i][1]=dp[i-1][0]+nums[i-1];
		}
		
		return Math.max(dp[nums.length][0],dp[nums.length][1] );

	}

}
