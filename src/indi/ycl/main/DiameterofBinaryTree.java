package indi.ycl.main;

import indi.ycl.model.TreeNode;

public class DiameterofBinaryTree {
	int max=0;
	// 其实就是求二叉树的深度
	public int diameterOfBinaryTree(TreeNode root) {
		maxDepth(root);
		return max;
	}

	private int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max = Math.max(max, left + right);

		return Math.max(left, right) + 1;
	}
}
