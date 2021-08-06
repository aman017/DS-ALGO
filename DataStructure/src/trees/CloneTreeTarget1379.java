package trees;

import java.util.LinkedList;
import java.util.Queue;

public class CloneTreeTarget1379 {

	static class TreeNode {
		TreeNode left, right;
		int val;

		TreeNode(int k) {
			left = right = null;
			val = k;
		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		TreeNode root1 = new TreeNode(4);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(6);
		root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);
		root1.right.left = new TreeNode(5);
		root1.right.right = new TreeNode(7);

		//TreeNode n = getTargetCopy(root, root1, root.right.left);
		TreeNode m= getTargetCopyRec(root, root1, root.right.left);
		if(null!=m)
		System.out.println(m.val);
		else
			System.out.println("Not Found");
		// System.out.println(n.val);

	}

	private static TreeNode getTargetCopy(TreeNode root, TreeNode root1, TreeNode t) {

		// bfs
		Queue<TreeNode> q1 = new LinkedList<>();
		Queue<TreeNode> q2 = new LinkedList<>();
		q1.add(root);
		q2.add(root1);
		while (!q1.isEmpty()) {
			TreeNode n = q1.poll();
			TreeNode m = q2.poll();

			if (n == t)
				return m;

			if (n.left != null) {
				q1.add(n.left);
				q2.add(m.left);
			}
			if (n.right != null) {
				q1.add(n.right);
				q2.add(m.right);
			}
		}
		return null;
	}

	private static TreeNode getTargetCopyRec(TreeNode root, TreeNode root1, TreeNode t) {

		//dfs
		if (root == null) {
			return null;
		}

		if (root == t)
			return root1;
		

		TreeNode l=getTargetCopyRec(root.left, root1.left, t);
		if(l!=null)return l;
		TreeNode r=getTargetCopyRec(root.right, root1.right, t);
		if(r!=null)return r;

		return null;

	}

}
