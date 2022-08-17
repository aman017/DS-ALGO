package tree;

public class SumOfLongestHeight {

	public class Prop {

		int h;
		int sum;

		Prop(int hi, int su) {
			this.h = hi;
			this.sum = su;
		}
	}

	public int sumOfLongRootToLeafPath(Node root) {
		// code here
		Prop p = solve(root);
		return p.sum;

	}

	public Prop solve(Node node) {

		if (node == null)
			return new Prop(0, 0);

		Prop p1 = solve(node.left);
		Prop p2 = solve(node.right);

		int s = node.data;
		int hi = 1;
		if (p1.h > p2.h) {
			s += p1.sum;
			hi += p1.h;
		} else if (p1.h < p2.h) {
			s += p2.sum;
			hi += p2.h;
		} else if (p1.sum > p2.sum) {
			s += p1.sum;
			hi += p1.h;
		} else {
			s += p2.sum;
			hi += p2.h;
		}

		return new Prop(hi, s);

	}

}
