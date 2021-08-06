package trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BottomView {
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
		root.right.right = new Node(6);
		printBottomView(root);

	}

	private static void printBottomView(Node root) {

		Map<Integer, Integer> map = new HashMap<>();
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node n=q.poll();
			//todo
			
		}

	}
}
