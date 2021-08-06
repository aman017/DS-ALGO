package trees;

import java.util.Stack;

public class InOrderIterative {

	public static class Node {
		Node right, left;
		int val;

		Node(int v) {
			right = left = null;
			val = v;
		}
	}

	public static void main(String[] args) {

		Node root = new Node(4);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		inOrder(root);

	}

	private static void inOrder(Node root) {

		if (root == null) {
			return;
		}

		Stack<Node> stk = new Stack<>();
		while (true) {
			if (root != null) {
				stk.push(root);
				root = root.left;
			} else {
				if (stk.isEmpty()) {
					break;
				}
				Node n = stk.pop();
				System.out.println(n.val);
				if (n.right != null) {
					root = n.right;
				}
			}
		}

	}

}
