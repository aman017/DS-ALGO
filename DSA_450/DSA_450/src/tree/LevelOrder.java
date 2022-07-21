package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	class Solution {
		// Function to return the level order traversal of a tree.
		static ArrayList<Integer> levelOrder(Node node) {
			// Your code here
			Queue<Node> q = new LinkedList<>();
			q.add(node);
			ArrayList<Integer> ans = new ArrayList<>();
			while (!q.isEmpty()) {
				Node temp = q.poll();
				ans.add(temp.data);
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}
			return ans;

		}
	}

}
