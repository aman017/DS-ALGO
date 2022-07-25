package tree;

public class Traversals_Recurssion {

	public static class Node {

		Node left;
		Node right;
		int val;

		Node(int k) {
			this.val = k;
			this.left = null;
			this.right = null;
		}
	}

	public static void main(String args[]) {

		Node root = new Node(10);

		root.left = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		root.right = new Node(17);
		root.right.left = new Node(12);

		System.out.println("InOrder:");
		inOrder(root);
		System.out.println();
		System.out.println("PreOrder:");
		preOrder(root);
		System.out.println();
		System.out.println("PostOrder:");
		postOrder(root);

	}

	private static void preOrder(Node root) {

		if (root == null)
			return;

		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	private static void postOrder(Node root) {

		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");

	}

	private static void inOrder(Node root) {

		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);

	}

}
