package recurssion;

import java.util.Scanner;

public class Sum1ToN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(calSum(sc.nextInt()));
	}

	private static int calSum(int n) {

		if (n == 0)
			return 0;

		else
			return n + calSum(n - 1);
	}

}
