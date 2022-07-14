package dynamicProgramming;

public class LongSubSeqdiff1 {

	static int longestSubsequence(int n, int a[]) {
		// code here

		int ans = 0;
		int dp[] = new int[a.length];
		for (int i = 0; i < a.length; ++i) {
			int max = 0;
			for (int j = 0; j < i; ++j) {
				if (Math.abs(a[i] - a[j]) == 1) {
					max = Math.max(max, dp[j]);
				}
			}
			dp[i] = 1 + max;
			ans = Math.max(ans, dp[i]);
		}
		return ans;

	}
}
