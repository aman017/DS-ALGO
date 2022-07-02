package dynamicProgramming;
//Initial Template for Java

class BinomialCofficient {

	public static int[][] dp = new int[1001][801];

	static int nCr(int n, int r) {
		if (r > n)
			return 0;
		if (r == 0 || r == n)
			return 1;
		if (dp[n][r] != 0)
			return dp[n][r];

		return dp[n][r] = (nCr(n - 1, r - 1) + nCr(n - 1, r)) % 1000000007;

	}

}