package indi.ycl.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DegreeofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findShortestSubArray(int[] nums) {
		int freq=0;
		int minlen=nums.length;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		Map<Integer,Integer[]> indexs=new HashMap<Integer, Integer[]>();
	   for (int i= 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		    freq=Math.max(freq, map.get(nums[i]));
		    if(indexs.get(nums[i])==null) indexs.put(nums[i], new Integer[2]);
		    Integer[] tmp=indexs.get(nums[i]);
		    if(tmp[0]==null) tmp[0]=i;
		    tmp[1]=i;
		}
		
		for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()!=freq) continue;
			Integer[] range=indexs.get(entry.getKey());
			minlen=Math.min(minlen, range[1]-range[0]+1);
			
		}
		
		return minlen;
		
		

	}

}
