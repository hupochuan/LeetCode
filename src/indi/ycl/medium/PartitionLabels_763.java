package indi.ycl.medium;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels_763 {
	public List<Integer> partitionLabels(String S) {
		if(S==null||S.length()==0) return null;
		List<Integer> re=new ArrayList<Integer>();
		
		int[] map=new int[26];
		for (int i = 0; i < S.length(); i++) {
			map[S.charAt(i)-'a']=i;
		}

		int start=0;
		int end=0;
		for (int i = 0; i < S.length(); i++) {
			end=Math.max(end, map[S.charAt(i)-'a']);
			if(end==i){
				re.add(end-start+1);
				start=end+1;
				end=0;
			}
		}
		return re;
	}

}
