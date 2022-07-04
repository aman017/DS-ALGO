package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class LongestIncSubseq {

	public static void main(String args[]) {

		int a[] = { 5, 1, 6 };
		System.out.println(longestSubsequence(3, a));
	}

	static Map<String, Integer> dp = new HashMap<>();

	static int longestSubsequence(int size, int a[]) {
		return solve(a, 0, -1);
	}

	public static int solve(int a[], int i, int max) {

		if (i >= a.length)
			return 0;
		int ans = 0;
		if (dp.containsKey(String.valueOf(i) + "_" + String.valueOf(max))) {
			return dp.get(String.valueOf(i) + "_" + String.valueOf(max));
		}
		if (a[i] > max) {
			ans += Math.max(1 + solve(a, i + 1, a[i]), solve(a, i + 1, max));
		} else {
			ans += solve(a, i + 1, max);
		}
		dp.put(String.valueOf(i) + "_" + String.valueOf(max), ans);
		return ans;
	}

}
