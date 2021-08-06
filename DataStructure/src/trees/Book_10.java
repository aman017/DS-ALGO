package trees;

public class Book_10 {

	// to check the subtree

	public static class Node {
		Node left, right;
		int val;

		Node(int k) {
			left = right = null;
			val = k;
		}
	}

	public static void main(String args[]) {

		Node root1 = new Node(3);
		root1.left = new Node(2);
		root1.left.left = new Node(1);
		root1.right = new Node(4);
		root1.right.left = new Node(5);
		root1.right.right = new Node(6);
		root1.right.right.right = new Node(6);

		Node root2 = new Node(4);
		root2.left = new Node(5);
		root2.right = new Node(6);

		System.out.println(checkSubTree(root1, root2));

	}

	private static boolean checkSubTree(Node root1, Node root2) {
		
		if (root2 == null && root1 == null) {
			return true;
		}

		if (root2 == null || root1 == null) {
			return false;
		}

		if (root1.val == root2.val) {
			return (checkSubTree(root1.left, root2.left) && checkSubTree(root1.right, root2.right));
		}

		return (checkSubTree(root1.left, root2) || checkSubTree(root1.right, root2));

	}

}
