package indi.ycl.main;

import indi.ycl.model.TreeNode;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q!=null||p!=null&&q==null) return false;
		if(p==null&&q==null) return true;
		
		if(p.val!=q.val) return false;
		
		return isSameTree(p.left,q.left)&&isSameTree(p.right, q.right);
	        
	}

}
