package dynamicProgramming;

public class MaxDiff0and1 {

	int maxSubstring(String S) {
		// code here
		int a[] = new int[S.length()];
		int b[] = new int[S.length()];
		int c = 0;
		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) == '0') {
				a[i] = 1;
				b[i] = -1;
			} else {
				++c;
				a[i] = -1;
				b[i] = 1;
			}
		}
		if (c == S.length())
			return -1;
		return kadens(a);

	}

	int kadens(int a[]) {

		int ans = 0;
		int max = 0;
		for (int i = 0; i < a.length; ++i) {

			if (max + a[i] > 0) {
				max += a[i];
				ans = Math.max(max, ans);

			} else {
				max = 0;
			}
		}
		return ans;
	}

}
