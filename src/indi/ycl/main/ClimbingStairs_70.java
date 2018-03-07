package indi.ycl.main;

public class ClimbingStairs_70 {
	public int climbStairs(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		
		int preOne=2;
		int preTwo=1;
		int totalNow=0;
		for (int i = 3; i <=n; i++) {
			totalNow=preOne+preTwo;
			preTwo=preOne;
			preOne=totalNow;
		}
		return totalNow;

	}
}
