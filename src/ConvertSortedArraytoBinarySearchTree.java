import indi.ycl.model.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length==0){
			return null;
		}
		return subArrayToBST(nums, 0,nums.length-1);
		

	}
	
	public TreeNode subArrayToBST(int[] nums,int start,int end){
		if(start>end)
			return null;
		int mid=(start+end)/2;
		TreeNode root=new TreeNode(nums[mid]);
		root.left=subArrayToBST(nums, start, mid-1);
		root.right=subArrayToBST(nums,mid+1,end);
		return root;
		
	}

	

}
