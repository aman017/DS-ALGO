package trees;

public class BalancedBST {

	static class TreeNode {
		TreeNode left;
		TreeNode right;
		int k;

		TreeNode(int val) {
			this.k = val;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(5);
		root.right = new TreeNode(8);

		chkBalanced(root);
		System.out.println(isBalanced);

	}

	static boolean isBalanced = true;

	private static int chkBalanced(TreeNode root) {
		if (root== null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		int i = Math.abs(chkBalanced(root.left) - chkBalanced(root.right))+1 ;
		if (i > 1)
			isBalanced = false;

		return i;

	}

}
