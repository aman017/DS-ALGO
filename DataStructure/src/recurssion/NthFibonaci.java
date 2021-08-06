package recurssion;

import java.util.Scanner;

public class NthFibonaci {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a=0,b=1;
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(n);
		else
		fibo(a,b,3,n);
		
	}

	private static void fibo(int a, int b, int c, int n) {
		System.out.println(a+b);
		if(c==n)
		{
			System.out.println(a+b);
			return;
		}
		else fibo(b,a+b,++c,n);
	}

}
