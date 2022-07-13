package dynamicProgramming;

public class PaintingFence {

	class Solution {
		long countWays(int n, int k) {
			long diff = (long) k;
			long same = 0L;
			long total = (long) diff + same;
			for (int i = 2; i <= n; ++i) {
				same = diff % 1000000007;
				diff = (total * (k - 1)) % 1000000007;
				total = (same % 1000000007 + diff % 1000000007) % 1000000007;
			}
			return total;
		}

	}

}
