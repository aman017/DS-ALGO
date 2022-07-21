package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Height {

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	int heightByDFS(Node node) {
		// code here
		if (node == null)
			return 0;

		else
			return 1 + Math.max(heightByDFS(node.left), heightByDFS(node.right));

	}

	int heightByBFS(Node node) {
		// code here
		List<Integer> list = new ArrayList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		int ans = 0;
		while (!q.isEmpty()) {
			++ans;
			Queue<Node> tq = new LinkedList<>();
			tq.addAll(q);
			while (!tq.isEmpty()) {
				Node temp = tq.poll();
				q.poll();
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);

			}
		}
		return ans;

	}

}
