package indi.ycl.main;

import java.util.Stack;

import indi.ycl.model.TreeNode;

public class SubtreeofAnotherTree_572 {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		return PreOrder(s).contains(PreOrder(t));

	}

	public String PreOrder_A(TreeNode root) {
		String path = "";
		if (root == null) {
			path += "#";
			return path;

		}
		path = path + root.val;
		path += PreOrder(root.left);
		path += PreOrder(root.right);
		System.out.println(path);
		return path;

	}
	//非递归先序遍历
	public String PreOrder(TreeNode root) {
		Stack<TreeNode> nodes=new Stack();
		StringBuffer s=new StringBuffer();
		nodes.add(root);
		while(!nodes.isEmpty()){
			TreeNode n=nodes.pop();
			if(n!=null){
				s.append("#");
				nodes.push(n.right);
				nodes.push(n.left);
			}else{
				s.append(n.val);
			}
			
		}
		return s.toString();
	}

}
