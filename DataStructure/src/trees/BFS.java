package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	static class Node {
		Node left, right;
		int value;

		Node(int k) {
			this.value = k;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(1);
		root.left.left = new Node(2);
		root.left.right = new Node(3);
		root.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		Queue<Node> que = new LinkedList<>();
		que.add(root);
		while (!que.isEmpty()) {
			Node peek = que.poll();
			if (peek != null) {
				System.out.print(peek.value+" ");
				que.add(peek.left);
				que.add(peek.right);
			}

		}

	}

}
