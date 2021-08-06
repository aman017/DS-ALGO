package recurssion;

import java.util.Scanner;

//Print a pattern without using any loop
public class GFG1Math {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		printPattern(n, n);

	}

	static boolean b = true, m = true;

	private static void printPattern(int n, int k) {

		System.out.print(k + " ");
		if (n == k) {
			b = !b;
			if (b) {
				return;
			}
		}

		if (k > 0 && m)
			k -= 5;
		else {
			m = false;
			k += 5;
		}

		printPattern(n, k);

	}

}
