package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	// Function to return a list of nodes visible from the top view
	// from left to right in Binary Tree.
	static ArrayList<Integer> topView(Node root) {
		// add your code
		ArrayList<Integer> ans = new ArrayList<>();
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Group> q = new LinkedList<>();
		if (root != null) {
			q.add(new Group(0, root));
		}
		while (!q.isEmpty()) {
			Group temp = q.poll();
			if (!map.containsKey(temp.hd)) {
				map.put(temp.hd, temp.node.data);
			}
			if (temp.node.left != null) {
				q.add(new Group(temp.hd - 1, temp.node.left));
			}
			if (temp.node.right != null) {
				q.add(new Group(temp.hd + 1, temp.node.right));
			}
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			ans.add(m.getValue());
		}
		return ans;

	}

	static class Group {

		Node node;
		int hd;

		Group(int k, Node n) {
			this.node = n;
			this.hd = k;
		}
	}

}
