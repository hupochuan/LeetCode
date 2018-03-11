package indi.ycl.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashDocAttributeSet;

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> trans=new HashSet<Integer>();
		Set<Integer> re=new HashSet<Integer>();
		for (int i : nums1) {
			trans.add(i);
		}
		
		for (int i : nums2) {
			if(trans.contains(i))
				re.add(i);
		}
		int[] result = new int[re.size()];
		int i=0;
		for (Integer integer : re) {
			result[i++]=integer;
		}
		return result;

	}

}
