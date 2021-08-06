package trees;

import java.util.Stack;

public class PreOrderIterative {

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

		preOrder(root);
	}

	private static void preOrder(Node root) {

		Stack<Node> stk = new Stack<>();
		stk.push(root);

		while (!stk.isEmpty()) {
			Node n = stk.pop();
			if (n.right != null) {
				stk.push(n.right);
			}
			if (n.left != null) {
				stk.push(n.left);
			}
			System.out.println(n.val);
		}

	}

}
