package recurssion;

import java.util.Scanner;

public class PallendromeString {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String s=sc.next();
		
		System.out.println(pall(s,0,s.length()-1));
		
		
	}

	private static boolean pall(String s, int b, int e) {
		
		if(b>=e)
			return true;
		
		if(!String.valueOf(s.charAt(b)).equalsIgnoreCase(String.valueOf( s.charAt(e))))
			return false;
		
		return true && pall(s, b+1, e-1);
		
	}

}
