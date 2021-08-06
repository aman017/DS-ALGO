package trees;

public class LongestDiameter {

	public static class Node {
		Node left;
		Node right;
		int val;

		public Node(int k) {
			this.left = null;
			this.right = null;
			this.val = k;
		}
	}

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(60);
		root.left.right.right = new Node(90);

		System.out.println(diameter(root));

	}

	private static int diameter(Node root) {
		
		if (root == null)
			return 0;

		int l = calDepth(root.left);
		int r = calDepth(root.right);

		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);

		return Math.max(Math.max(ldiameter, rdiameter), l + r + 1);
	}

	private static int calDepth(Node root) {

		if (root == null)
			return 0;

		return Math.max(calDepth(root.left), calDepth(root.right)) + 1;

	}

}
