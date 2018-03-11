package indi.ycl.easy;

import indi.ycl.model.TreeNode;

public class SymmetricTree_101 {
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		return isSame(root.left, root.right);
	}
	
	public boolean isSame(TreeNode l,TreeNode r){
		if(l==null&&r==null) return true;
		if(l==null||r==null) return false;
		if(l.val!=r.val) return false;
		return isSame(l.left,r.left)&&isSame(l.right, r.right);
	}

}
