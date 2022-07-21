package dynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {

	class Pair {
		int x;
		int y;
	}

	int[][] dp = new int[101][100001];

	int maxChainLength(Pair a[], int n) {
		// your code here
		for (int[] d : dp) {
			Arrays.fill(d, -1);
		}
		Arrays.sort(a, Comparator.comparing(p -> p.x));
		return solve(a, 0, 0, dp);
	}

	int solve(Pair a[], int i, int max, int[][] dp) {

		if (i == a.length)
			return 0;
		int sum = 0;

		if (dp[i][max] != -1)
			return dp[i][max];

		if (a[i].x > max) {
			sum += Math.max(1 + solve(a, i + 1, a[i].y, dp), solve(a, i + 1, max, dp));
		} else {
			sum += solve(a, i + 1, max, dp);
		}
		return dp[i][max] = sum;

	}

}
