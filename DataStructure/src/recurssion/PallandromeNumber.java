package recurssion;

import java.util.Scanner;

public class PallandromeNumber {
	
	public static void main (String srgs[]) {
		
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int r=fun(k,0);
		System.out.println(r);
		System.out.println(r==k);
	}

	private static int fun(int n , int rev) { // base case
        if (n == 0) {
            return rev;
        }
 
        rev = rev * 10 + (n % 10);
        rev = fun(n / 10, rev);
        return rev;}
	
	/* 	1234
	 * 	
	 * 4
	 * 40+3
	 * 430+2
	 * 4320+1
	 * 4321
	 * 
	 * 
	 * 123
	 * 3+2+1+0
	 * 
	 * 
	 */

}
