package indi.ycl.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import indi.ycl.model.TreeNode;

public class BinaryTreePaths_257 {
	public List<String> binaryTreePaths(TreeNode root) {
	
		List<String> paths=new ArrayList<String>();
		
		if(root!=null) traversal(paths, "",root);
		
		return paths;
 
	}
	public void traversal(List<String> paths,String path,TreeNode node){
		if(node.left==null&&node.right==null)  paths.add(path+node.val); 
		if(node.left!=null) traversal(paths, path+node.val+"->", node.left);
		if(node.right!=null) traversal(paths, path+node.val+"->", node.right);
	}

}
