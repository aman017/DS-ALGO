package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

	public static class Node {

		Node left, right;
		int val;

		Node(int k) {
			left = right = null;
			val = k;
		}
	}

	public static void main(String[] args) {

		Node root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.right = new Node(4);
		root.right.left = new Node(5);

		printLeftView(root);

	}

	private static void printLeftView(Node root) {

		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int i = 0;
			Queue<Node> qt = new LinkedList<>();
			while (!q.isEmpty()) {
				Node n = q.poll();
				if (i == 0)
					System.out.println(n.val);

				if (n.left != null)
					qt.add(n.left);

				if (n.right != null)
					qt.add(n.right);
				++i;
			}
			q = qt;

		}

	}

}
