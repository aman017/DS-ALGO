package tree;

public class KthAnccestor {

	static int k = 0;
	static Node temp = null;

	public static void main(String args[]) {
		
		  /*
        1
        / \
        /     \
    -2     3
    / \     / \
    / \ / \
    4     5 -6     2
*/

		Node root = new Node(1);
		root.left = new Node(-2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(-6);
		root.right.right = new Node(2);
		k = 1;
		Node parent = solve(root, -6);

		if (parent != null)
			System.out.println("-1");
	}

	static Node solve(Node root, int node) {
		// Base case
		if (root == null)
			return null;

		if (root.data == node || (temp = solve(root.left, node)) != null || (temp = solve(root.right, node)) != null) {
			if (k > 0)
				k--;

			else if (k == 0) {
				// print the kth ancestor
				System.out.print("Kth ancestor is: " + root.data);

				// return null to stop further backtracking
				return null;
			}

			// return current node to previous call
			return root;
		}
		return null;
	}

}
