package tree;

public class IsomorphicCheck {

	boolean isIsomorphic(Node n1, Node n2) {
		// code here.
		if (n1 == null && n2 == null)
			return true;

		if (n1 == null || n2 == null)
			return false;

		if (n1.data == n2.data) {

			return (isIsomorphic(n1.left, n2.left) && isIsomorphic(n1.right, n2.right))
					|| (isIsomorphic(n1.left, n2.right) && isIsomorphic(n1.right, n2.left));
		} else {
			return false;
		}
	}

}
