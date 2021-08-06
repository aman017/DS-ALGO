package treeAndGraphs;

public class Range_Sum_of_BST {
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		
		public TreeNode(int k) {
			this.left=null;
			this.right=null;
			this.val=k;
		}
		
	}

	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(7);
		root.right=new TreeNode(15);
		root.right.right=new TreeNode(18);
		
		System.out.println(rangeSum(root,7,15));
	}

	private static int rangeSum(TreeNode root, int low, int high) {
		int sum=0;
		if(root==null)
			return 0;
		sum+=rangeSum(root.left, low, high);
		sum+=rangeSum(root.right,  low, high);
		if(root.val>=low && root.val<=high)
			return sum+=root.val;
		
		return sum;
	}

}
