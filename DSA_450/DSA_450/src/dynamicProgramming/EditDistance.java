package dynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EditDistance {

	static int dp[][] = new int[101][101];

	public int editDistance(String s, String t) {
		// Code here

		 Set<Integer> set=new HashSet<>();
		for (int[] d : dp) {
			Arrays.fill(d, -1);
		}
		return solve(s, t, s.length(), t.length());
	}

	public int solve(String s1, String s2, int a, int b) {

		if (a == 0)
			return b;
		if (b == 0)
			return a;

		if (dp[a][b] != -1)
			return dp[a][b];

		if (s1.charAt(a - 1) == s2.charAt(b - 1))
			return solve(s1, s2, a - 1, b - 1);

		return dp[a][b] = 1
				+ Math.min(solve(s1, s2, a, b - 1), Math.min(solve(s1, s2, a - 1, b), solve(s1, s2, a - 1, b - 1)));

	}

}
