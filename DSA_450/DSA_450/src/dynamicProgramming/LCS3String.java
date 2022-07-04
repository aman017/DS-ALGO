package dynamicProgramming;

public class LCS3String {

	int LCSof3(String A, String B, String C, int n1, int n2, int n3) {
		return lcs(A, B, C);

	}

	public int lcs(String s1, String s2, String s3) {

		int m = s1.length();
		int n = s2.length();
		int o = s3.length();

		int[][][] dp = new int[m + 1][n + 1][o + 1];
		for (int i = 0; i < m + 1; ++i) {
			for (int j = 0; j < n + 1; ++j) {
				for (int k = 0; k < o + 1; ++k) {
					if (i == 0 || j == 0 || k == 0)
						dp[i][j][k] = 0;
				}
			}
		}

		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j) {
				for (int k = 1; k <= o; ++k) {
					if (s1.charAt(i - 1) == s2.charAt(j - 1) && s2.charAt(j - 1) == s3.charAt(k - 1)) {
						dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;

					} else {
						dp[i][j][k] = Math.max(dp[i][j][k - 1], Math.max(dp[i][j - 1][k], dp[i - 1][j][k]));
					}
				}
			}
		}

		return dp[m][n][o];
	}

}
