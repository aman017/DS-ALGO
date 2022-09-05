package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort_DFS {

	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		// add your code here
		int v = V;
		int[] ans = new int[v];
		Stack<Integer> stk = new Stack<>();

		int[] vis = new int[v];
		for (int i = 0; i < v; ++i) {
			if (vis[i] == 0) {
				solve(adj, stk, vis, i);
			}
		}
		int i = 0;
		// System.out.println();
		while (!stk.isEmpty()) {

			ans[i++] = stk.pop();
			// System.out.print(ans[i-1]+" ->");
		}

		return ans;
	}

	static void solve(ArrayList<ArrayList<Integer>> adj, Stack<Integer> stk, int[] vis, int i) {

		vis[i] = 1;
		for (Integer n : adj.get(i)) {
			if (vis[n] == 0) {
				solve(adj, stk, vis, n);
			}
		}
		stk.push(i);
		// System.out.print(i+" ->");

	}

}
