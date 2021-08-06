package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

//Print all increasing sequences of length k from first n natural numbers
public class GFG2Array {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		int n = sc.nextInt();

		int ar[] = new int[n];

		for (int i = 1; i <= n; ++i) {
			ar[i - 1] = i;
		}

		ArrayList<Integer> l = new ArrayList<>();
		printSeq(ar, k, l);
	}

	private static void printSeq(int[] ar, int k, ArrayList<Integer> l) {

		if (l.size() == k) {
			for (Integer i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		} else {
			for (int i = 0; i < ar.length; ++i) {
				if (l.isEmpty() || (ar[i] > l.get(l.size() - 1))) {
					ArrayList<Integer> al = new ArrayList<>();
					al.addAll(l);
					al.add(ar[i]);
					printSeq(ar, k, al);
				}
			}

		}
	}
	/*
	 * 1 2 3
	 */

}
