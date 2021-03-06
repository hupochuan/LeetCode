package indi.ycl.easy;

import indi.ycl.model.TreeNode;

public class BalancedBinaryTree_110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	public boolean isBalanced(TreeNode root) {
//		if(root==null) return true;
//		int left=getDepth(root.left);
//		int right=getDepth(root.right);
//		return Math.abs(left-right)<1&&isBalanced(root.left)&&isBalanced(root.right);
//	}
//	public int getDepth(TreeNode root){
//		if(root==null) return 0;
//		return Math.max(getDepth(root.left),getDepth(root.right))+1;
//	}
	
	public boolean isBalanced(TreeNode root) {
		return getDis(root)!=-1;
	}
	//按正常求深度的方法执行，一旦发现有不平衡子树，立即跳出循环
	public int getDis(TreeNode root){
		if(root==null) return 0;
		int left=getDis(root.left);
		if(left==-1) return -1;
		int right=getDis(root.right);
		if(right==-1) return -1;
		if(Math.abs(left-right)>1)
			return -1;
		return Math.max(left, right)+1;

	}
	
	
}
