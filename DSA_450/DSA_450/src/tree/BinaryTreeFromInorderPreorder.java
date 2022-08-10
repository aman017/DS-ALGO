package tree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInorderPreorder {

	int pi = 0;
	Map<Integer, Integer> map = new HashMap<>();

	public Node buildTree(int inorder[], int preorder[], int n) {
		// code here
		for (int i = 0; i < n; ++i) {
			map.put(inorder[i], i);
		}
		return solve(inorder, preorder, 0, n - 1);

	}

	public Node solve(int[] in, int[] pre, int s, int e) {

		if (s > e)
			return null;

		Node root = new Node(pre[pi]);
		int i = map.get(pre[pi]);
		++pi;
		if (s == e)
			return root;
		root.left = solve(in, pre, s, i - 1);
		root.right = solve(in, pre, i + 1, e);

		return root;

	}

}
