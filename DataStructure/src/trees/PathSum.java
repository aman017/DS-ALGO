package trees;

import trees.MinimumDepth.Node;

public class PathSum {

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
		

		System.out.println(hasPathSum(root, 10));

	}

	public static boolean hasPathSum(Node root, int sum) {
		return pathSum(root, sum);

	}

	public static boolean pathSum(Node node, int sum) {
			if(node==null)
				return false;
			if (sum - node.val == 0 && node.left==null && node.right==null) {
				return true;
			}
		return (pathSum(node.left, sum - node.val) || pathSum(node.right, sum - node.val));

	}

}
