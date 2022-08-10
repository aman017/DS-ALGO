package tree;

import java.util.Stack;

public class BinaryTreeFromString {

	public static void main(String args[]) {

		String s = "4(2(3)(1))(6(5))";

		Stack<Node> stk = new Stack<>();

		char[] ch = s.toCharArray();
		Node cur = new Node(ch[0]-'0');
		stk.push(cur);
		for (int i = 1; i < ch.length; ++i) {
			
			Node node = null;
			if (ch[i] == '(') {
				// push
				while (i < ch.length && ch[i] == '(')
					++i;
				if (i < ch.length) {
					node = new Node(ch[i]-'0');
					stk.push(node);
				}
			} else if (ch[i] == ')') {
				// pop
				stk.pop();
			}
			if (node != null) {
				if (cur.left == null)
					cur.left = node;
				else
					cur.right = node;
			}
			cur = stk.peek();
		}
		System.out.println(cur.data);

	}

}
