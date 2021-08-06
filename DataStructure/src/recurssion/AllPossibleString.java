package recurssion;

import java.util.Scanner;

public class AllPossibleString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of char");
		int n = sc.nextInt();
		char[] c = new char[n];
		c = sc.next().toCharArray();
		System.out.println("Enter k:");
		int k = sc.nextInt();

		substrings(c, k, "");
		System.out.println(p);

	}
	
	static int p=0;

	private static void substrings(char[] c, int k, String o) {

		if (o.length() == k) {
			System.out.println(o);
			++p;
			return;
		} else {
			for (int i = 0; i < c.length; i++) {
				String s=new String();
				s=o+String.valueOf(c[i]);
				substrings(c, k, s);
			}

		}

	}
	
	/*
	 * a b 2
	 * 
	 * aa
	 * bb
	 * ab
	 * ba
	 * 
	 * 
	 */

}
