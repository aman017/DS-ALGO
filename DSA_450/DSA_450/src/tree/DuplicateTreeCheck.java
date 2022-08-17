package tree;

import java.util.ArrayList;
import java.util.List;

public class DuplicateTreeCheck {

	List<Node> list = new ArrayList<>();
	boolean f = false;

	int dupSub(Node root) {
		// code here

		getleft(root.left);

		if (root.right != null)
			getRight(root.right);

		return f == true ? 1 : 0;

	}

	public void getRight(Node node) {

		if (node == null)
			return;

		if (!f) {
			for (Node n : list) {
				if (node.data == n.data) {
					f = check(node, n);
				}
				if (f)
					return;
			}
			getRight(node.left);
			getRight(node.right);
		}
	}

	public boolean check(Node l, Node r) {

		if (l == null && r == null) {
			return true;
		}

		if (l == null || r == null)
			return false;

		if (l.data == r.data)
			return check(l.left, r.left) && check(l.right, r.right);
		else
			return false;
	}

	public void getleft(Node node) {

		if (node == null)
			return;

		if (node.left == null && node.right == null)
			return;

		list.add(node);
		getleft(node.left);
		getleft(node.right);

	}

}
