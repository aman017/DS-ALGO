package tree;

public class MinSwapForBST {

	public class Node {

		Node left;
		Node right;
		int val;

		Node(int k) {
			this.val = k;
		}
	}

	int[] in = {};
	int c = 0;

	public int minSwaps(int n, int[] A) {
		// code here

		Node root = createTree(A, 0);
		in = new int[n];
		getInOrder(root);

		int ans = 0;
		for (int i = 0; i < n; ++i) {

			int min = in[i];
			int ind = i;
			for (int j = i + 1; j < n; ++j) {
				if (in[j] < min) {
					min = in[j];
					ind = j;
				}
			}
			if (ind != i) {
				int temp = in[i];
				in[i] = in[ind];
				in[ind] = temp;
				++ans;
			}
		}
		return ans;
	}

	public void getInOrder(Node node) {

		if (node == null)
			return;

		getInOrder(node.left);
		in[c++] = node.val;
		getInOrder(node.right);

	}

	public Node createTree(int[] a, int i) {

		if (i >= a.length)
			return null;

		Node root = new Node(a[i]);
		root.left = createTree(a, 2 * i + 1);
		root.right = createTree(a, 2 * i + 2);

		return root;
	}

}
