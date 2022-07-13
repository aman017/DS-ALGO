package dynamicProgramming;

import java.util.Arrays;

public class MaximizeCuts {
	// Function to find the maximum number of cuts.
	int dp[] = new int[10001];

	public int maximizeCuts(int n, int x, int y, int z) {
		// Your code here
		Arrays.fill(dp, -1);
		int ans = solve(n, x, y, z, dp);
		if (ans < 0)
			ans = 0;
		return ans;
	}

	int solve(int n, int x, int y, int z, int[] dp) {

		if (n < 0)
			return Integer.MIN_VALUE;

		if (n == 0)
			return 0;

		if (dp[n] != -1)
			return dp[n];

		return dp[n] = 1
				+ Math.max(Math.max(solve(n - x, x, y, z, dp), solve(n - y, x, y, z, dp)), solve(n - z, x, y, z, dp));
	}

}
