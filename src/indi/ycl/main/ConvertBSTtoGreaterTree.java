package indi.ycl.main;

import indi.ycl.model.TreeNode;

public class ConvertBSTtoGreaterTree {
    int plus=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode convertBST(TreeNode root) {
		
		if(root.right!=null) convertBST(root.right);
		int tmp=root.val;
		root.val+=plus;
		plus+=tmp;
		if(root.left!=null) convertBST(root.left);	
		
		return root;

	}

}
