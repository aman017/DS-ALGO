package recurssion;

import java.util.Scanner;

public class Atoi {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = 0;
		if (s == null)
			System.out.println(0);
		else {
			if (s.charAt(0) == '-') {
				System.out.println(atoi(s, 1, n) * -1);
			} else {
				System.out.println(atoi(s, 0, n));
			}
		}
	}

	private static int atoi(String s, int i, int n) {

		if (i == s.length())
			return n;
		else {
			n = n * 10 + s.charAt(i) - '0';
			n = atoi(s, ++i, n);

		}
		return n;

	}

}
