package indi.ycl.main;

public class MinCostClimbingStairs {
	// 动态规划问题，核心在于问题拆分
	public int minCostClimbingStairs(int[] cost) {
		int[] minCost = new int[cost.length + 1];
		minCost[0] = 0;
		minCost[1] = 0;
		for (int i = 2; i <= cost.length; i++) {
			minCost[i] = Math.min(minCost[i - 1] + cost[i - 1], minCost[i - 2] + cost[i - 2]);
		}

		return minCost[minCost.length - 1];

	}

	// 只问到达顶楼的最小时间，可以不用保存整个数组
	public int minCostClimbingStairs1(int[] cost) {
		int cost1 = 0;
		int cost2 = 0;
		int cost3 = 0;
		for (int i = 2; i <= cost.length; i++) {
			cost3 = Math.min(cost2 + cost[i - 1], cost1 + cost[i - 2]);
			cost1=cost2;
			cost2=cost3;

		}

		return cost3;

	}

}
