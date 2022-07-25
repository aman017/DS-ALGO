package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	class Tree {
		// Function to return list containing elements of left view of binary tree.
		ArrayList<Integer> leftView(Node root) {
			// Your code here
			ArrayList<Integer> ans = new ArrayList<>();
			Queue<Node> q = new LinkedList<>();
			if (root != null)
				q.add(root);

			while (!q.isEmpty()) {

				Queue<Node> t = new LinkedList<>();
				t.addAll(q);
				int n = 1;
				while (!t.isEmpty()) {
					Node temp = q.poll();
					t.poll();
					if (n == 1) {
						ans.add(temp.data);
					}
					++n;
					if (temp.left != null)
						q.add(temp.left);
					if (temp.right != null)
						q.add(temp.right);
				}

			}
			return ans;

		}
	}

}
