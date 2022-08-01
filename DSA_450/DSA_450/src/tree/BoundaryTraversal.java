package tree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {

	class Solution {
		ArrayList<Integer> boundary(Node node) {
			ArrayList<Integer> ans = getLeft(node);

			getLeafNodes(node, ans);

			getRight(node.right, ans);
			return ans;
		}

		ArrayList<Integer> getLeft(Node node) {

			ArrayList<Integer> ans = new ArrayList<>();

			if (node == null)
				return ans;

			while (node.left != null && node.right != null) {
				ans.add(node.data);
				if (node.left != null) {
					node = node.left;
				} else {
					node = node.right;
				}
			}
			return ans;
		}

		void getLeafNodes(Node node, List<Integer> leaf) {

			if (node == null)
				return;

			if (node.left == null && node.right == null)
				leaf.add(node.data);
			getLeafNodes(node.left, leaf);
			getLeafNodes(node.right, leaf);

		}

		void getRight(Node node, List<Integer> right) {

			if (node == null || (node.left == null && node.right == null)) {
				return;
			}
			if (node.right != null) {
				getRight(node.right, right);
			} else {
				getRight(node.left, right);
			}
			right.add(node.data);
		}
	}

}
