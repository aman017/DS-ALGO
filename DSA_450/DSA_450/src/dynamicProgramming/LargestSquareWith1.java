package dynamicProgramming;

public class LargestSquareWith1 {

	static int maxSquare(int n, int m, int mat[][]) {
		// code here
		int[][] dp = new int[n + 1][m + 1];
		int max = 0;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= m; ++j) {
				if (mat[i - 1][j - 1] > 0)
					dp[i][j] = mat[i - 1][j - 1] + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
				max = Math.max(max, dp[i][j]);
			}
		}
		return max;
	}

}
