package trees;

public class MinimumDepth {

	static class Node {
		int val;
		Node left;
		Node right;

		public Node(int k) {
			val = k;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.right.right = new Node(18);
		root.right.left = new Node(18);
		
		System.out.println(minDepth(root));

	}

	public static int minDepth(Node root) {

		int min = Integer.MAX_VALUE;
		return findMinimumDepth(root, 1, min);
	}

	public static int findMinimumDepth(Node root, int level, int min) {

		if (root.left == null && root.right==null) {
			return Math.min(min, level);
		} else {
			++level;
			if(root.left!=null)
			min=findMinimumDepth(root.left, level, min);
			if(root.right!=null)
			min=findMinimumDepth(root.right, level, min);
		}
		return min;
	}

}
