package tree;

public class IsomorphicTree {
	class Solution {
		// Return True if the given trees are isomotphic. Else return False.
		boolean isIsomorphic(Node node1, Node node2) {
			// code here.
			if (node1 == null && node2 == null)
				return true;

			if (node1 == null || node2 == null)
				return false;

			if (node1.data != node2.data)
				return false;

			return (isIsomorphic(node1.left, node2.left) && isIsomorphic(node1.right, node2.right))
					|| (isIsomorphic(node1.left, node2.right) && isIsomorphic(node1.right, node2.left));

		}

	}

}
