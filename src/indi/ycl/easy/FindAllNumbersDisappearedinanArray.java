package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> re=new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			int index=Math.abs(nums[i]-1);
			if(nums[index]>0){
				nums[index]=-nums[index];	
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0)
				re.add(i+1);
		}
		return re;
	}

}
