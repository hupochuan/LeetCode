package indi.ycl.medium;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII_260 {
	public int[] singleNumber_A(int[] nums) {
		Set<Integer> set=new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if(!set.add(nums[i]))
				set.remove(nums[i]);
		}
		
		int[] re=new int[set.size()];
		int index=0;
		for (int i : set) {
			re[index++]=i;
		}
		return re;
	}
	
	public int[] singleNumber_B(int[] nums) {
		 int differ=0;
			for (int i : nums) {
				differ^=i;
			}
			differ&=-differ;
			
			int[] result={0,0};
			for (int i : nums) {
				if((i&differ)==0){
					result[0]^=i;
				}else{
					result[1]^=i;
				}
			}
			return result;
	}

}
