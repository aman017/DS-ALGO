package dynamicProgramming;

import java.util.Arrays;

public class LongSubSeqdiff1 {

	public static void main(String[] args) {

		int[] s = { 9, 10, 4, 5, 4, 8, 6 };

		System.out.println(longestSubsequence(7, s));
	}

	static int[][] dp = new int[1001][1001];

	static int longestSubsequence(int n, int a[]) {
		// code here
		for (int[] d : dp) {
			Arrays.fill(d, -1);
		}

		int lss = 1;
		for (int i = 0; i < n; ++i) {
			lss = Math.max(lss, 1 + solve(a, i+1, a[i], dp));
		}
		return lss;

	}

	static int solve(int[] a, int in, int val, int[][] dp) {

		if (in == a.length) {
			return 0;
		}
		if (dp[in][val] != -1) {
			return dp[in][val];
		}
		int sum = 0;
		if (a[in] == val + 1 || a[in] == val - 1) {
			sum = sum + 1 + solve(a, in + 1, a[in], dp);
		} else {
			sum = sum + solve(a, in + 1, val, dp);
		}
		return dp[in][val] = sum;
	}

}
