package indi.ycl.easy;

public class RangeAdditionII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxCount(int m, int n, int[][] ops) {
		
		if(ops.length==0) return m*n;
		int minx=-1,miny=-1;
		for (int[] is : ops) {
			if(is[0]<minx||minx<0)
				minx=is[0];
			if(is[1]<miny||miny<0)
				miny=is[1];
		}
		if(minx<0||miny<=0) return 0;
		else return minx*miny;

	}

}
