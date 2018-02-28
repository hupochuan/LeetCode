import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import indi.ycl.model.TreeNode;

public class BinaryTreeLevelOrderTraversalII107 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		// List是接口 ArrayList是实现类
		if (root == null)
			return new ArrayList<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Stack<List<Integer>> levels = new Stack<List<Integer>>();
		List<TreeNode> nowlevel = new ArrayList<TreeNode>();
		// List<TreeNode> nextlevel=new ArrayList<TreeNode>();
		nowlevel.add(root);

		while (nowlevel.size() != 0) {
			List<TreeNode> nextlevel = new ArrayList<TreeNode>();
			List<Integer> nums = new ArrayList<Integer>();
			for (int i = 0; i < nowlevel.size(); i++) {
				TreeNode node = nowlevel.get(i);
				nums.add(node.val);
				if (node.left != null)
					nextlevel.add(node.left);
				if (node.right != null)
					nextlevel.add(node.right);
				
			}
			
			nowlevel=nextlevel;
			levels.add(nums);
		}
		
		while(!levels.empty()){
			result.add(levels.pop());
		}
		
		return result;

	}
	//分割线 别人家的方法比较好，偷师一下
    //层次遍历
	public List<List<Integer>> levelOrderBottom1(TreeNode root) {
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		List<List<Integer>> warpList=new ArrayList<List<Integer>>();
		if(root==null) return warpList;
		
		q.offer(root);
		
		while(!q.isEmpty()){
			int l=q.size();
			List<Integer> subList=new ArrayList<Integer>();
			for (int i = 0; i < l; i++) {
				if(q.peek().left!=null) q.offer(q.peek().left);
				if(q.peek().right!=null) q.offer(q.peek().right);
				subList.add(q.poll().val);
			}
			warpList.add(0, subList);
			
		}
		
		return warpList;	
	}
	//深度优先
	public List<List<Integer>> levelOrderBottom2(TreeNode root) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		levelMaker(root,result,0);
		return result;
	}
	public void levelMaker(TreeNode root,List<List<Integer>> list,int level){
		if(root==null) return;
		if(list.size()<level){
			list.add(new ArrayList<Integer>());
		}
		levelMaker(root.left,list,level+1);
		levelMaker(root.right, list, level+1);
		list.get(list.size()-level-1).add(root.val);
		
		
	}

}
