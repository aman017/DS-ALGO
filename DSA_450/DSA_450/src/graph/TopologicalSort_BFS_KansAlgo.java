package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort_BFS_KansAlgo {

	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		// add your code here
		int[] in = new int[V];
		for (List<Integer> n : adj) {

			for (Integer nb : n) {
				++in[nb];
			}
		}

		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < V; ++i) {
			if (in[i] == 0)
				q.add(i);
		}

		int[] ans = new int[V];
		int i = 0;
		while (!q.isEmpty()) {

			int p = q.remove();
			List<Integer> nb = adj.get(p);
			for (Integer n : nb) {
				--in[n];
				if (in[n] == 0)
					q.add(n);
			}
			ans[i++] = p;
		}
		return ans;

	}

}
