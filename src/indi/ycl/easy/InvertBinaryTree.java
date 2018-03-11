package indi.ycl.easy;

import indi.ycl.model.TreeNode;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode invertTree(TreeNode root) {
		if(root==null) return null;
		TreeNode right=invertTree(root.left);
		root.left=invertTree(root.right);
		root.right=right;
		
		return root;
		
		

	}

}
