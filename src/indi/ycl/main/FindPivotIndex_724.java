package indi.ycl.main;

public class FindPivotIndex_724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int pivotIndex(int[] nums) {
		
		int[] sum=new int[nums.length];
		int preSum=0;
		for (int i = 0; i < nums.length; i++) {
			sum[i]=preSum;
			preSum=sum[i]+nums[i];
		}
	
		for (int i = 0; i < sum.length; i++) {
		    if(sum[i]==preSum-sum[i]-nums[i])
		    	return i;
		}
		return -1;
		

	}

}
