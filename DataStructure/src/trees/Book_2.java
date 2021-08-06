package trees;

public class Book_2 {

	// minimal depth tree from a sorted array

	public static class Node {
		Node left, right;
		int val;

		Node(int v) {
			left = right = null;
			val = v;
		}
	}

	public static void main(String args[]) {

		int n = 5;
		int a[] = new int[] { 1, 2, 3, 4, 5, 6 };

		Node root = null;
		Node rootc = root;
		root = consTree(a, 0, n, root);
		printInOrder(root);

	}

	private static void printInOrder(Node root) {

		if (root == null)
			return;

		printInOrder(root.left);
		System.out.println(root.val);
		printInOrder(root.right);

	}

	private static Node consTree(int[] a, int start, int end, Node root) {

		if (start > end)
			return null;

		int mid = (start + end) / 2;
		root = new Node(a[mid]);

		root.left = consTree(a, start, mid - 1, root.left);
		root.right = consTree(a, mid + 1, end, root.right);

		return root;

	}

}
