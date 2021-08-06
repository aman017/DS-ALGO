package trees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		FastReader sc = new FastReader();

		int t = sc.nextInt();

		while (t-- > 0) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 1 || b == 1) {
				System.out.println("Yes");
				continue;
			}

			int g = gcd(a, b);
			if (g > 1)
				System.out.println("Yes");
			else
				System.out.println("No");

		}

	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		int k;
		for (k = 0; ((a | b) & 1) == 0; ++k) {
			a >>= 1;
			b >>= 1;
		}

		while ((a & 1) == 0)
			a >>= 1;

		do {
			while ((b & 1) == 0)
				b >>= 1;

			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}

			b = (b - a);
		} while (b != 0);

		return a << k;
	}

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = null;
		}

		public String next() {
			if (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}
	}

}
