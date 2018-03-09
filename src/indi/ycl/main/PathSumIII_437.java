package indi.ycl.main;

import java.util.HashMap;
import java.util.Map;

import indi.ycl.model.TreeNode;

public class PathSumIII_437 {
	int cnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 方法一：递归 ，时间复杂度n2
	// public int pathSum(TreeNode root, int sum) {
	// if (root == null)
	// return 0;
	// return getPathNum(root, sum) + pathSum(root.left, sum) +
	// pathSum(root.right, sum);
	// }
	//
	// public int getPathNum(TreeNode root, int target) {
	// if (root == null)
	// return 0;
	// return (root.val == target ? 1 : 0) + getPathNum(root.left, target -
	// root.val)
	// + getPathNum(root.right, target - root.val);
	//
	// }

	public int pathSum(TreeNode root, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		helper(root,map,0,sum);
		return count;
	}

	int count = 0;

	public void helper(TreeNode node, Map<Integer, Integer> map, int curSum, int target) {
		if (node == null)
			return;

		curSum += node.val;
		if (map.containsKey(curSum - target))
			count += map.getOrDefault(curSum - target, 0);
		if (map.containsKey(curSum))
			map.put(curSum, map.getOrDefault(curSum, 0) + 1);
		else
			map.put(curSum, 1);
		helper(node.left, map, curSum, target);
		helper(node.right, map, curSum, target);
		map.put(curSum, map.get(curSum)-1);

	}

}
