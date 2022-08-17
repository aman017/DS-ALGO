package tree;

public class LargestSubTree {
	
	static int max=0;
	public static void main(String args[])
	{
	    /*
	            1
	            / \
	            /     \
	        -2     3
	        / \     / \
	        / \ / \
	        4     5 -6     2
	    */
	 
	    Node root = new Node(1);
	    root.left = new Node(-2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.right.left = new Node(-6);
	    root.right.right = new Node(2);
	    solve(root);
	    System.out.println(max);
	}

	private static int solve(Node root) {
		
		if(root==null)
			return 0;
		
		int l=solve(root.left);
		int r=solve(root.right);
		
		int sum=root.data+l+r;
		if(sum>max) max=sum;
		
		return sum;
		
	}

}
