package graph;

import java.util.ArrayList;
import java.util.List;

public class CreateGraph {

	public static void main(String args[]) {

		List<List<Integer>> adj = new ArrayList<>();
		graph(adj);
		printList(adj);
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
