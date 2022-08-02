package tree;

public class TransformToSumTree {

	class Solution {
		public void toSumTree(Node node) {
			// add code here.

			solve(node);

		}

		public int solve(Node node) {
			// add code here.

			if (node == null)
				return 0;

			int l = solve(node.left);

			int r = solve(node.right);
			int k = node.data;
			node.data = l + r;
			return l + r + k;

		}
	}

}
