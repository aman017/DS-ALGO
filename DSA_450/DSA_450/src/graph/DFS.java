package graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {

	static List<Integer> ans = new ArrayList<>();
	static int vis[] = null;

	public static void main(String args[]) {

		List<List<Integer>> adj = new ArrayList<>();
		createGraph(adj);

		printGraph(adj);

		int v = adj.size() - 1;// taken 1 based indexing
		vis = new int[v + 1];

		for (int i = 1; i <= v; ++i) {

			if (vis[i] == 0) {
				dfs(adj, i);
			}
		}

		System.out.println("DFS:");
		for (int i = 0; i < ans.size(); ++i) {
			System.out.println(ans.get(i));
		}

	}

	private static void dfs(List<List<Integer>> adj, int i) {

		if (vis[i] == 0) {
			vis[i] = 1;
			ans.add(i);
			List<Integer> list = adj.get(i);
			for (Integer l : list) {
				if (vis[l] == 0) {
					dfs(adj, l);
				}
			}
		}

	}

	private static void createGraph(List<List<Integer>> adj) {

		int v = 4;
		// lets consider 1 base indexing
		for (int i = 0; i <= v; ++i) {
			List<Integer> list = new ArrayList<>();
			adj.add(list);
		}

		insertEdge(adj, 1, 2);
		insertEdge(adj, 2, 3);
		insertEdge(adj, 1, 4);
		insertEdge(adj, 4, 3);

	}

	private static void insertEdge(List<List<Integer>> adj, int i, int j) {

		adj.get(i).add(j);
		adj.get(j).add(i);

	}

	public static void printGraph(List<List<Integer>> adj) {

		for (int i = 1; i <adj.size(); ++i) {
			System.out.print(i + "->");
			List<Integer> list = adj.get(i);
			for (Integer l : list) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
