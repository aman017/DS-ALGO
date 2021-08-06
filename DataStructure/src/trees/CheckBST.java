package trees;

public class CheckBST {

	public static class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;

		public TreeNode(int k) {
			this.left = null;
			this.right = null;
			this.val = k;
		}
	}

	public static void main(String args[]) {

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(6);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		System.out.println(checkBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE));

	}

	private static boolean checkBST(TreeNode root, int maxValue, int minValue) {

		if (root == null)
			return true;

		if (root.val > maxValue || root.val <= minValue) {
			return false;
		}

		return (checkBST(root.left, root.val, minValue) && checkBST(root.right, maxValue, root.val));
	}

}
