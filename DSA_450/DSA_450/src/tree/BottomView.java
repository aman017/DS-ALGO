package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
	
	public ArrayList <Integer> bottomView(Node root)
    {
     ArrayList<Integer> ans = new ArrayList<>();
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Group> q = new LinkedList<>();
		if (root != null) {
			q.add(new Group(0, root));
		}
		while (!q.isEmpty()) {
			Group temp = q.poll();
			map.put(temp.hd, temp.node.data);
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
