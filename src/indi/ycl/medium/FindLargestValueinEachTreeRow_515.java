package indi.ycl.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import indi.ycl.model.TreeNode;

public class FindLargestValueinEachTreeRow_515 {
	
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> re=new ArrayList<Integer>();
		preOrder(root, 0 , re);
		return re;
		
		
	}
	public void preOrder(TreeNode node,int h,List<Integer> list){
		if(node==null) return ;
		 
	    if(h>=list.size())
	    	list.add(h, node.val);
	    else if(node.val>list.get(h)){
	    	
	    	list.set(h, node.val);
	    }
	    h++;
	    
	    preOrder(node.left,h,list);
		
		preOrder(node.right,h,list);
		
		
	}

}
