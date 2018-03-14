package indi.ycl.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray_442 {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> re=new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
		    int num=Math.abs(nums[i]);
			if(nums[num-1]>0)
				nums[num-1]=-nums[num-1];
			else
				re.add(i);
		}
		return re;

	}

}
