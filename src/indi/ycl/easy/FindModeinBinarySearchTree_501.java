package indi.ycl.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import indi.ycl.model.TreeNode;

public class FindModeinBinarySearchTree_501 {
	public int[] findMode(TreeNode root) {
		
		List<Integer> list=new ArrayList<Integer>();
		int maxF=0;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> set: map.entrySet()) {
			if(set.getValue()>maxF){
				list.clear();
				list.add(set.getKey());
			}else if(set.getValue()==maxF)
				list.add(set.getKey());
		}
		int[] re=new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			re[i]=list.get(i);
		}
		return re;
		
	}
	public void helper(TreeNode root,Map<Integer,Integer> map){
		if(root==null) return ;
		map.put(root.val, map.getOrDefault(root.val, 0)+1);
		helper(root.left, map);
		helper(root.right, map);
	}

}
