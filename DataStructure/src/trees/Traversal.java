package trees;

//DFS
public class Traversal {

	static class Node {
		Node left, right;
		int value;

		Node(int k) {
			this.value = k;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(1);
		root.left.left = new Node(2);
		root.left.right = new Node(3);
		root.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println("PreOrder:");

		printPreOrder(root);
		System.out.println();
		System.out.println("InOrder:");
		printInOrder(root);
		System.out.println();
		System.out.println("PostOrder:");
		printPostOrder(root);

	}

	private static void printPostOrder(Node root) {
		if (root == null)
			return;
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.value+" ");

	}

	private static void printInOrder(Node root) {
		if (root == null)
			return;
		printInOrder(root.left);
		System.out.print(root.value+" ");
		printInOrder(root.right);

	}

	private static void printPreOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.value+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);

	}

}
