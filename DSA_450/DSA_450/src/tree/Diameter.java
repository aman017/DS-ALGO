package tree;

public class Diameter {
	
	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}
	
	class Solution {
	    // Function to return the diameter of a Binary Tree.
	    int max=0;
	    
	    int diameter(Node root) {
	        solve(root);
	        return max;
	    }
	    int solve(Node root) {
	        
	        if(root==null)
	        return 0;
	        
	        int l=solve(root.left);
	        int r=solve(root.right);
	      
	      if(max<(1+l+r))
	      max=1+l+r;
	      
	       return 1+Math.max(l,r);
	        
	    }
	}

}
