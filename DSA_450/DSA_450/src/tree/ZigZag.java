package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	ArrayList<Integer> zigZagTraversal(Node node) {
		// Add your code here.
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		boolean dir = true;
		while (!q.isEmpty()) {
			Queue<Node> tq = new LinkedList<>();
			tq.addAll(q);
			ArrayList<Integer> tlist = new ArrayList<>();
			while (!tq.isEmpty()) {
				Node temp = tq.poll();
				tlist.add(temp.data);
				q.poll();
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}
			if (!dir) {
				Collections.reverse(tlist);
			}
			dir = !dir;
			list.addAll(tlist);
		}
		return list;
	}

}
