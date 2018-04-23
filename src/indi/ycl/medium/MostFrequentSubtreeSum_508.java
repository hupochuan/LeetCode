package indi.ycl.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import indi.ycl.model.TreeNode;

public class MostFrequentSubtreeSum_508 {
	public int[] findFrequentTreeSum(TreeNode root) {
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		List<Integer> list=new ArrayList<Integer>();
		helper(root,map);
		int curMax=0;
		for(Map.Entry<Integer, Integer> e:map.entrySet()){
			int k=e.getKey();
			int v=e.getValue();
			if(v<curMax) continue;
			
			
			if(v>curMax){
				list.clear();
				list.add(k);
			}else{
				list.add(k);
			}
			curMax=v;
		}
		int[] d = new int[list.size()];  
		for(int i = 0;i<list.size();i++){  
		    d[i] = list.get(i);  
		}  
		return d;
		
	}
	public int helper(TreeNode root,Map<Integer, Integer> map){
		if(root==null) return 0;
		int left=helper(root.left,map);
		int right=helper(root.right, map);
		int sum=left+right+root.val;
		map.put(sum,map.getOrDefault(sum, 0)+1);
		return sum;
	}

}
