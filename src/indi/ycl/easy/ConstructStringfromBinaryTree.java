package indi.ycl.easy;

import indi.ycl.model.TreeNode;

public class ConstructStringfromBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String tree2str(TreeNode t) {
		StringBuffer re;
		if(t==null) return "";
		re=new StringBuffer(String.valueOf(t.val));
		
		if(t.right!=null){
			re.append("("+tree2str(t.left)+")"+"("+tree2str(t.right)+")");
		}else if(t.left!=null){
			re.append("("+tree2str(t.left)+")");
		}
		
		
	
		return re.toString();

	}

}
