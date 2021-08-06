package treeAndGraphs;

public class IncreasingOrderSearchTree {
	
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int k){
			this.val=k;
			this.left=null;
			this.right=null;
		}
	}
	
	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(3);
		root.left.left=new TreeNode(2);
		root.left.left.left=new TreeNode(1);
		root.left.right=new TreeNode(4);
		root.right=new TreeNode(6);
		root.right.right=new TreeNode(8);
		root.right.right.right=new TreeNode(9);
		root.right.right.left=new TreeNode(7);
		
		System.out.println(solution(root));
		
	}

	private static char[] solution(TreeNode root) {
		// TODO Auto-generated method stub
		return null;
	}

}
