package indi.ycl.main;

import indi.ycl.model.TreeNode;

public class MinimumAbsoluteDifferenceinBST {
	int min=Integer.MAX_VALUE;
	Integer pre=null;  //int为基本类型，不能赋值为空
	public int getMinimumDifference(TreeNode root) {
		if(root==null) return min;
		
		getMinimumDifference(root.left);
		
		if(pre!=null){
			min=Math.min(min, root.val-pre);
		}
		pre=root.val;
		
		getMinimumDifference(root.right);
		
		return min;
		

	}

}
