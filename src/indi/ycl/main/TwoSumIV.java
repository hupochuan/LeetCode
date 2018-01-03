package indi.ycl.main;

import java.util.ArrayList;
import java.util.List;

import indi.ycl.model.TreeNode;

public class TwoSumIV {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	List<Integer> nums=new ArrayList<Integer>();
    

	public boolean findTarget(TreeNode root, int k) {
		nums.clear();
		GetNums(root);
		if(nums.size()<2) return false;
		if(nums.get(0)+nums.get(1)>k||nums.get(nums.size()-1)+nums.get(nums.size()-2)<k)
			return false;
		for (int i = 0; i < nums.size(); i++) {
			if(nums.get(i)*2==k) continue;
			if(nums.contains(k-nums.get(i)))
				return true;
		}
		return false;

	}
	
	public void GetNums(TreeNode root){
		if(root==null) return;
		if(root.left!=null) GetNums(root.left);
		nums.add(root.val);
		if(root.right!=null) GetNums(root.right);
			
		
	}

}
