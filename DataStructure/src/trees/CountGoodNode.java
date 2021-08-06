package trees;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CountGoodNode {
	public static void main(String args[]) throws IOException {

		FastReader sc = new FastReader();

		int t = sc.nextInt();
		OutputStream out = new BufferedOutputStream(System.out);

		while (t-- > 0) {
			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; ++i) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);

			boolean is = false;
			int d = 1;
			int i = 0, min = Integer.MAX_VALUE, ti = 0;
			for (i = 0; i < 2; i++) {
				int tc = 0, dc = 0;
				for (int j = i + 1; j < n; ++j) {
					if (a[j] % a[i] == 0) {
						++tc;
						dc += a[j] / a[i];
					}
				}
				if (tc >= n - 2) {
					is = true;
					if (min > dc) {
						min = dc;
						ti = i;
					}
				}
			}
			i = ti;

			if (is) {
				d = a[i];
				boolean js = false;
				for (i = n - 1; i > -1; --i) {
					if (a[i] % d != 0) {
						a[i] = d;
						js = true;
						break;
					}
				}
				if (!js)
					a[n - 1] = d;
			} else {
				a[n - 1] = d;
			}

			int r = 0;
			for (i = 0; i < n; ++i) {
				r += a[i] / d;
			}

			out.write((r + "").getBytes());
			out.write(("\n").getBytes());
		}
		out.flush();
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
