package indi.ycl.easy;

import indi.ycl.model.TreeNode;

public class BinaryTreeTilt {
	public int findTilt(TreeNode root) {

		if (root == null)
			return 0;
//		int tilt = 0;
		int tilt=Math.abs(SumOfTreeNode(root.left)-SumOfTreeNode(root.right));
		tilt+=findTilt(root.left);
		tilt+=findTilt(root.right);
		return tilt;

	}

	public int SumOfTreeNode(TreeNode root) {
		if (root == null)
			return 0;
		int sum = 0;
		sum += root.val;
		sum += SumOfTreeNode(root.left);
		sum += SumOfTreeNode(root.right);

		return sum;

	}

}
