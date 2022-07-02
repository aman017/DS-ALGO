package dynamicProgramming;

import java.util.Arrays;

class KanpscakProblem {
	// Function to return max value that can be put in knapsack of capacity W.
	int knapSack(int W, int wt[], int val[], int n) {
		// Your code here
		int[][] dp = new int[W + 1][n + 1];
		for (int[] d : dp) {
			Arrays.fill(d, -1);
		}
		return solve(W, wt, val, 0, dp);
	}

	int solve(int W, int wt[], int val[], int i, int[][] dp) {

		if (i >= wt.length || W <= 0)
			return 0;

		int sum = 0;

		if (dp[W][i] != -1) {
			return dp[W][i];
		}

		if (wt[i] <= W)
			sum += Math.max(val[i] + solve(W - wt[i], wt, val, i + 1, dp), solve(W, wt, val, i + 1, dp));
		else {
			sum += solve(W, wt, val, i + 1, dp);
		}
		return dp[W][i] = sum;

	}
}