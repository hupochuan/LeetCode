package indi.ycl.medium;

public class ArithmeticSlices_413 {
	//核心问题是找规律：
//	输入为时0，1，2，sum=1 +2
//			0，1，2，3 sum=3；+3
//			0，1，2，3，4 sum=6；+4
//			0，1，2，3，4，5 sum=10；
	
    public int numberOfArithmeticSlices(int[] A) {
    	int cur=0,sum=0;
    	
    	for (int i = 2; i < A.length; i++) {
			if(A[i]-A[i-1]==A[i-1]-A[i-2]){
				cur++;
				sum+=cur;
			}else{
				cur=0;
			}
			
			
			
		}
    	return sum;
    	
        
    }
	

}
