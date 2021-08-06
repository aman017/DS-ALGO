package trees;

import java.util.Stack;

import trees.InvertTree.Node;

public class SubTree {
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int k) {
			val = k;
			left = null;
			right = null;
		}
	}
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		
		TreeNode t = new TreeNode(2);
		t.left = new TreeNode(3);
		t.right = new TreeNode(4);

		System.out.println(isSubtree(root,t));

	}
	
	 public static boolean isSubtree(TreeNode s, TreeNode t) {
	        
	        Stack<TreeNode> stk=new Stack<>();
	        stk.push(s);
	        while(!stk.isEmpty()){
	            TreeNode n=stk.pop();
	            if(n==null && t!=null)
	                return false;
	            if(n==null && t==null)
	                return true;
	            if(n.left!=null){
	                stk.push(n.left);
	            }
	            if(n.right!=null){
	                stk.push(n.right);
	            }
	            if(isSame(n,t)){
	                return true;
	            }
	        }
	        return false;
	    }
	        
	        public static boolean isSame(TreeNode s, TreeNode t){
	            
	            if(s ==null && t==null){
	                return true;
	            } 
	            if((s!=null && t==null) || (s==null && t!=null)){
	                return false;
	            }
	            if(s.val==t.val){
	                return (isSame(s.left,t.left)&&(isSame(s.right,t.right)));
	            }else{
	                return false;
	            }
	        }

}
