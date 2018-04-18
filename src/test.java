import indi.ycl.model.TreeNode;

public class test {

	 public static void main(String[] args) {
		    // write your code here
		    TreeNode root=new TreeNode(1);
		    root.left=new TreeNode(2);
		    root.right=new TreeNode(3);
		    preOrder(root);
		    
		    reverseTree(root);
		    preOrder(root);
		    
		  
	    }
	    
	    public static TreeNode reverseTree(TreeNode root){
	        if(root==null) return null;
	        if(root.left!=null)
	          reverseTree(root.left);
	        if(root.right!=null)
	          reverseTree(root.right);
	        
	        TreeNode tmp=root.left;
	        root.left=root.right;
	        root.right=tmp;
	        return root;
	    }
	    public static void preOrder(TreeNode root){
	        if(root==null){
	          return;
	        }
	        System.out.println(root.val);
	        preOrder(root.left);
	        preOrder(root.right);
	    
	    }

}
