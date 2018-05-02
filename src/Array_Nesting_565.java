
public class Array_Nesting_565 {
	public int arrayNesting(int[] nums) {
		
		int maxlen=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]<0) continue;
			
			int curlen=1;
			int start=i,index=i;
			
			while(start!=Math.abs(nums[index])){
				
				index=Math.abs(nums[index]);
				curlen++;
				nums[index]*=-1;
			}
			maxlen=Math.max(curlen, maxlen);
			
		}
		return maxlen;

	}

}
