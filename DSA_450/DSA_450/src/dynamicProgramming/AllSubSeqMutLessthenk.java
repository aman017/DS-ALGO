package dynamicProgramming;

public class AllSubSeqMutLessthenk {

	// static int[][] dp=new int[2000][]

	public static void main(String[] args) {

		// Count all subsequences having product less than K
		int a[] = { 1,2,3,4,5};
		int k = 8;
		int n = a.length;
		int dp[][] = new int[k + 1][n + 1];

		for (int i = 1; i < k + 1; ++i) {
			for (int j = 1; j < n + 1; ++j) {

				dp[i][j] = dp[i][j - 1];
				if (a[j - 1] <= i && a[j - 1] > 0) {
					dp[i][j] += 1 + dp[i / a[j - 1]][j - 1];
				}

			}
		}
		System.out.println(dp[k][n]);

	}

}
