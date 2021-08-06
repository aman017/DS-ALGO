package recurssion;

public class RangeSumBST {

	public static class Node {

		Node left;
		Node right;
		int k;

		Node(int v) {
			this.k = v;
		}
	}

	public static void main(String args[]) {

		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.right.right = new Node(18);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		int low = 7;
		int high = 15;
		System.out.println(rangeSum(root, low, high));
	}

	private static int rangeSum(Node root, int low, int high) {

		return dfs(root, low, high);

	}

	private static int dfs(Node root, int low, int high) {
		int sum=0;
		if (root == null)
			return 0;
		sum += dfs(root.left, low, high);
		sum += dfs(root.right, low, high);
		if (root.k >= low && root.k <= high) {
			sum += root.k;
			System.out.println(root.k);
		}

		return sum;
	}

}
