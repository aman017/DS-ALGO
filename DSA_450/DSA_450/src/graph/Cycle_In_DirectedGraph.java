package graph;

import java.util.ArrayList;

public class Cycle_In_DirectedGraph {

	// Function to detect cycle in a directed graph.
	public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
		// code here
		int[] vis = new int[adj.size()];
		int[] visdfs = new int[adj.size()];

		for (int i = 0; i < adj.size(); ++i) {

			if (vis[i] == 0) {

				if (solve(adj, vis, visdfs, i))
					return true;
			}
		}
		return false;
	}

	public boolean solve(ArrayList<ArrayList<Integer>> adj, int[] vis, int[] visdfs, int i) {
		vis[i] = 1;
		visdfs[i] = 1;
		ArrayList<Integer> nbr = adj.get(i);
		if (!nbr.isEmpty()) {
			for (Integer n : nbr) {
				if (vis[n] == 0) {
					if (solve(adj, vis, visdfs, n))
						return true;
				} else {
					if (visdfs[n] == 1)
						return true;
				}
			}
		}
		visdfs[i] = 0;
		return false;

	}

}
