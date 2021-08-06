package recurssion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		System.out.println(fac(k));

	}

	private static int fac(int k) {
		
		if(k==1)
			return 1;
		
		else 
			return k*fac(k-1);
	}

}
