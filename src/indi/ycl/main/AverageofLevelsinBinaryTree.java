package indi.ycl.main;

import java.util.ArrayList;
import java.util.List;

public class AverageofLevelsinBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(2147483647);
		root.left=new TreeNode(2147483647);
		root.right=new TreeNode(2147483647);
		new AverageofLevelsinBinaryTree().averageOfLevels(root);

	}

	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result=new ArrayList<Double>();
		List<TreeNode> nowlevel=new ArrayList<TreeNode>();
		nowlevel.add(root);
		while(!nowlevel.isEmpty()){
			Double sum=0.0,count=0.0;
			List<TreeNode> nextlevel=new ArrayList<TreeNode>();
		    for (TreeNode treeNode : nowlevel) {
				if(treeNode.left!=null) nextlevel.add(treeNode.left);
				if(treeNode.left!=null) nextlevel.add(treeNode.right);
				sum+=treeNode.val;
				
				count++;
			}
		   
		    result.add(1.0*sum/count);
		    nowlevel=nextlevel;
		}
		
		System.out.println(result);
		return result;

	}

}
