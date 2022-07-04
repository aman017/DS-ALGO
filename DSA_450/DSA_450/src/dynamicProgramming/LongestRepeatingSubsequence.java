package dynamicProgramming;

public class LongestRepeatingSubsequence {

	public int LongestRepeatingSubsequence(String s1) {
		// code here
		String s2 = new String(s1);
		int m = s1.length();

		int[][] dp = new int[m + 1][m + 1];
		for (int i = 0; i <= m; ++i) {
			for (int j = 0; j <= m; ++j) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
			}
		}

		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= m; ++j) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1) && i != j) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[m][m];

	}
}
