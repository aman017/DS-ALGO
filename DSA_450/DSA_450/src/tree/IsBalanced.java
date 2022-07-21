package tree;

public class IsBalanced {
	
	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}
	
	boolean isBalanced(Node root)
    {
	// Your code here
	int l=solve(root.left);
	int r=solve(root.right);
	if(l==Integer.MAX_VALUE || r==Integer.MAX_VALUE)
	return false;
	return Math.abs(l-r)>1?false:true;
	
    }
    
    int solve(Node node){
        
        if(node==null)
        return 0;
        
        int l=solve(node.left);
        int r=solve(node.right);
        if(l==Integer.MAX_VALUE || r==Integer.MAX_VALUE)
        return Integer.MAX_VALUE;
        if(Math.abs(l-r)<=1)
        return 1+Math.max(l,r);
        else
        return Integer.MAX_VALUE;
        
    }

}
