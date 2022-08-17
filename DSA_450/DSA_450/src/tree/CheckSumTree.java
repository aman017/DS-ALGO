package tree;

public class CheckSumTree {
	boolean isSumTree(Node root) {
		// Your code here

		if (root.left == null && root.right == null)
			return true;

		int l = 0;
		if (root.left != null)
			l = solve(root.left);

		int r = 0;
		if (root.right != null)
			r = solve(root.right);

		return (l + r == root.data);
	}

	int solve(Node node) {

		if (node.left == null && node.right == null)
			return node.data;

		int l = 0;
		if (node.left != null)
			l = solve(node.left);

		int r = 0;
		if (node.right != null)
			r = solve(node.right);

		if (l + r == node.data) {
			return l + r + node.data;
		} else {
			return Integer.MIN_VALUE;
		}

	}
}
