package tree;

public class LeafAtSameLevel {

	class Solution {
		boolean check(Node root) {
			// Your code here

			int h = leftH(root);
			// System.out.println(h);

			return solve(root, h, 0);
		}

		int leftH(Node node) {

			if (node == null)
				return -1;

			int sum = 0;
			if (node.left != null)
				sum += 1 + leftH(node.left);
			else
				sum += 1 + leftH(node.right);

			return sum;
		}

		boolean solve(Node node, int h, int c) {

			if (node == null)
				return true;

			if (node.left == null && node.right == null) {
				return h == c;
			}

			return solve(node.left, h, c + 1) && solve(node.right, h, c + 1);

		}

	}

}
