package trees;

import java.util.Stack;

import trees.PathSum.Node;

public class InvertTree {

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
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		root.right = new Node(15);
		root.right.right = new Node(18);

		invertTree(root);

	}

	public static void invertTree(Node root) {
		Stack<Node> stk=new Stack<>();
		stk.push(root);
		while(!stk.isEmpty()) {
			Node n=stk.pop();
			Node r=n.right;
			stk.push(r);
			Node l=n.left;
			stk.push(l);
			n.left=r;
			n.right=l;
			
		}

	}

}
