package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeToGreaterSumTree {

	static class TreeNode {

		TreeNode left;
		TreeNode right;
		int val;

		TreeNode(int k) {
			this.val = k;
		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(1);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(2);
		root.left.right.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(8);
		root.right.right.right.right = new TreeNode(100);

		bstToGst(root);
	}

	public static TreeNode bstToGst(TreeNode root) {
		 /*Written By Aman*/
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int a[] = new int[101];
		while (!q.isEmpty()) {
			TreeNode r = q.poll();
			a[r.val+1] = r.val;
			if (r.left != null)
				q.add(r.left);
			if (r.right != null)
				q.add(r.right);
		}
		int b[] = new int[101];
		int sum = 0;
		for (int i = 1; i < 101; ++i) {
			b[i] = sum += a[i];
		}
		q.add(root);
		root.val=sum-b[root.val];
		while (!q.isEmpty()) {
			TreeNode r = q.poll();
			if (r.left != null) {
				r.left.val = sum-b[r.left.val];
				q.add(r.left);
			}
			if (r.right != null) {
				r.right.val = sum-b[r.right.val];
				q.add(r.right);
			}
		}

		return root;
	}
	
	

}
