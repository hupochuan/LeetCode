package indi.ycl.medium;

import indi.ycl.model.TreeNode;

public class FindBottomLeftTreeValue_513 {
	TreeNode re=null;
	int maxHight=0;
	public int findBottomLeftValue(TreeNode root) {
		preOrder(root, 0);
		return re.val;

	}
	public void preOrder(TreeNode node,int h){
		if(node==null) return ;
		
	    if(++h>maxHight){
	    	maxHight=h;
	    	re=node;
	    }
	    	
	    preOrder(node.left,h);
		
		preOrder(node.right,h);
		
		
	}

}
