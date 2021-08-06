package trees;

import java.util.Stack;

public class EvenSumGrandParents {
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

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(15);
		root.right.right = new TreeNode(18);

		System.out.println(sum(root));
	}

	private static Integer sum(TreeNode root) {

		Stack<TreeNode> stk = new Stack<>();
		if (root != null) {
			stk.push(root);
		}
		int sum = 0;
		while (!stk.isEmpty()) {
			TreeNode n = stk.pop();
			if (n.left != null) {
				stk.push(n.left);
			}
			if (n.right != null) {
				stk.push(n.right);
			}

			if (n.val % 2 == 0) {
				if (n.left != null) {
					if (n.left.left != null) {
						sum += n.left.left.val;
					}
					if (n.left.right != null) {
						sum += n.left.right.val;
					}
				}
				if (n.right != null) {
					if (n.right.left != null) {
						sum += n.right.left.val;
					}
					if (n.right.right != null) {
						sum += n.right.right.val;
					}
				}
			}
		}

		return sum;
	}

}
