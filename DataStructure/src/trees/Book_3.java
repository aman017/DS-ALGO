package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Book_3 {
	
	//Male a list of values by all levels of the Tree

	static class Node {
		Node left, right;
		int val;

		Node(int k) {
			left = right = null;
			val = k;
		}
	}

	public static void main(String args[]) {

		Node root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);

		List<List<Node>> depthList = calDepthList(root);
		System.out.println();

	}

	private static List<List<Node>> calDepthList(Node root) {
		List<List<Node>> depthList = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			List<Node> list = new ArrayList<>();
			Queue<Node> qt = new LinkedList<>();
			while (!q.isEmpty()) {
				Node t = q.poll();
				list.add(t);
				if (t.left != null) {
					qt.add(t.left);
				}
				if (t.right != null) {
					qt.add(t.right);
				}

			}
			depthList.add(list);
			q = qt;

		}

		return depthList;
	}

}
