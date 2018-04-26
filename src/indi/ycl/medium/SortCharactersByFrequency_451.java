package indi.ycl.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class SortCharactersByFrequency_451 {
	public String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> pq =
				new PriorityQueue<Map.Entry<Character, Integer>>((a, b)->{return b.getValue()-a.getValue();});
		pq.addAll(map.entrySet());
		StringBuffer re=new StringBuffer();
		while(!pq.isEmpty()){
			Map.Entry<Character, Integer> e=pq.poll();
			for (int i = 0; i < e.getValue(); i++) {
				re.append(e.getKey());
			}
			
			
		}
		return re.toString();

	}

}
