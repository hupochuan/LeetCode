package indi.ycl.easy;

public class TrimaBinarySearchTree {
	int val;
	MergeTwoBinaryTrees left;
	MergeTwoBinaryTrees right;

	public MergeTwoBinaryTrees mergeTrees(MergeTwoBinaryTrees t1, MergeTwoBinaryTrees t2) {
		if(t1==null&&t2==null) return null;
		
		int val=(t1==null?0:t1.val)+(t2==null?0:t1.val);
		MergeTwoBinaryTrees newNode=new MergeTwoBinaryTrees(val);
		newNode.left=mergeTrees(t1==null?null:t1.left, t2==null?null:t2.left);
		newNode.right=mergeTrees(t1==null?null:t1.right, t2==null?null:t2.right);
		return newNode;

	}
	
	public MergeTwoBinaryTrees trimBST(MergeTwoBinaryTrees root, int L, int R) {
		if(root==null) return null;
		if(root.val<L) return trimBST(root.right, L, R);
		if(root.val>R) return trimBST(root.left, L, R);
		
		if(root.left!=null) root.left=trimBST(root.left, L, R);
		if(root.right!=null) root.right=trimBST(root.right, L, R);
	    
		return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
