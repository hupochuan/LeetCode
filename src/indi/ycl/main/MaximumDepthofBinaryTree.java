package indi.ycl.main;

import indi.ycl.model.TreeNode;

public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		System.out.println(new MaximumDepthofBinaryTree().maxDepth(root));

	}

	public int maxDepth(TreeNode root) {
		if(root==null) return 0;
		if(root.left==null&&root.right==null) return 1;
		int maxLeft=root.left!=null?maxDepth(root.left):0;
		int maxRight=root.right!=null?maxDepth(root.right):0;
		
		return maxLeft>maxRight?maxLeft+1:maxRight+1;
		

	}
	public int maxDepth1(TreeNode root){
		if(root==null) return 0;
		return 1+Math.max(maxDepth1(root.left), maxDepth1(root.right));
		
	}

}
