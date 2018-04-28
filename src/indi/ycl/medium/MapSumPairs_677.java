package indi.ycl.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSumPairs_677 {
	Map<String,Integer> map;
    public MapSumPairs_677() {
    	this.map=new HashMap<String, Integer>();  
    	
    }

	public void insert(String key, int val) {
		this.map.put(key,val);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
    		System.out.println(entry.getKey()+" "+entry.getValue());
    	}
	}

	public int sum(String prefix) {
		int sum=0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			sum+=entry.getKey().indexOf(prefix)==0?entry.getValue():0;
		}
		return sum;

	}

}
