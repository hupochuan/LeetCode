package indi.ycl.easy;

public class MergeTwoBinaryTrees {

	int val;
	MergeTwoBinaryTrees left;
	MergeTwoBinaryTrees right;

	MergeTwoBinaryTrees(int x) {
		val = x;
	}

	public MergeTwoBinaryTrees mergeTrees(MergeTwoBinaryTrees t1, MergeTwoBinaryTrees t2) {
		if(t1==null&&t2==null) return null;
		
		int val=(t1==null?0:t1.val)+(t2==null?0:t1.val);
		MergeTwoBinaryTrees newNode=new MergeTwoBinaryTrees(val);
		newNode.left=mergeTrees(t1==null?null:t1.left, t2==null?null:t2.left);
		newNode.right=mergeTrees(t1==null?null:t1.right, t2==null?null:t2.right);
		return newNode;

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
