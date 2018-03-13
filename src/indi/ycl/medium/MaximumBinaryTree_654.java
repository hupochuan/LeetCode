package indi.ycl.medium;

import indi.ycl.model.TreeNode;

public class MaximumBinaryTree_654 {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return helper(nums,0,nums.length-1);

	}
	public TreeNode helper(int[] nums,int start,int end){
		if(start>end) return null;
		int maxNum=Integer.MIN_VALUE;
		int maxIndex=Integer.MIN_VALUE;
		for (int i = start; i <= end; i++) {
			if(nums[i]>maxNum){
				maxNum=nums[i];
				maxIndex=i;
			}
		}
		TreeNode root=new TreeNode(maxNum);
		root.left=helper(nums,start,maxIndex-1);
		root.right=helper(nums,maxIndex+1,end);
		
		return root;
		
	}
}
