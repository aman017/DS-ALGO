package trees;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSum {

	public static class Node {

		Node left;
		Node right;
		int val;

		public Node(int k) {
			this.val = k;
		}
	}

	public static void main(String args[]) {

		Node root = new Node(10);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		root.right = new Node(15);
		root.right = new Node(18);

		System.out.println(findSumByBFS(root, 7, 15));
		
		System.out.println(findSumByDFS(root, 7, 15));
	}

	private static int findSumByBFS(Node root, int low, int high) {

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int sum = 0;
		while (!q.isEmpty()) {
			Node r = q.poll();

			if (null != r.left)
				q.add(r.left);

			if (null != r.right)
				q.add(r.right);

			if (r.val >= low && r.val <= high)
				sum += r.val;

		}
		return sum;
	}

	private static int findSumByDFS(Node root, int low, int high) {
		
		int sum=0;
		if(root==null)
			return 0;
		else {
			if(root.val>=low && root.val<=high)
				sum+=root.val;
			sum+=findSumByDFS(root.left, low, high);
			sum+=findSumByDFS(root.right, low, high);
			return sum;
		}
	}

}
