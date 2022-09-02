package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

	public static void main(String args[]) {

		List<List<Integer>> adj = new ArrayList<>();
		graph(adj);
		printList(adj);
		System.out.println("BFS:");
		printBFS(adj);

	}

	public static void printBFS(List<List<Integer>> adj) {
		int n = adj.size() - 1;
		int vis[] = new int[n + 1];
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; ++i) {
			if (vis[i] == 0) {
				q.add(i);
				vis[i] = 1;
				while (!q.isEmpty()) {
					int p = q.remove();
					System.out.println(p);
					List<Integer> nbr = adj.get(p);
					for (Integer nb : nbr) {
						if (vis[nb] == 0) {
							vis[nb] = 1;
							q.add(nb);
						}
					}
				}
			}
		}
	}

	public static void graph(List<List<Integer>> adj) {
		for (int i = 0; i <= 4; ++i) {
			adj.add(new ArrayList<>());
		}

		createGraph(adj, 1, 2);
		createGraph(adj, 1, 3);
		createGraph(adj, 3, 4);
	}

	private static void createGraph(List<List<Integer>> adj, int s, int d) {
		adj.get(s).add(d);
		adj.get(d).add(s);
	}

	private static void printList(List<List<Integer>> adj) {

		for (int i = 1; i < adj.size(); ++i) {
			System.out.print(i + " -> ");
			List<Integer> list = adj.get(i);
			for (Integer l : list) {
				System.out.print(" " + l);
			}
			System.out.println();
		}

	}

}
