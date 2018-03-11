package indi.ycl.easy;

public class BestTimetoBuyandSellStock121 {
	//遍历了一遍，时间复杂度应该为2n
	public int maxProfit(int[] prices) {
		if(prices.length==0||prices.length==1) return 0;
		int length=prices.length;
		int maxPro=0;
		int maxSale=prices[length-1];
		for (int i = length-2; i >=0; i--) {
			if(prices[i]>maxSale)
				maxSale=prices[i];
			if(maxSale-prices[i]>maxPro)
				maxPro=maxSale-prices[i];
				
		}
		
		return maxPro;

	}

}
