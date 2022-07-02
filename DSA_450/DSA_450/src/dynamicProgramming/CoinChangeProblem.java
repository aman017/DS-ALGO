package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;
class GfG {
 public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while (t-- > 0) {
         int n = sc.nextInt();
         int m = sc.nextInt();
         int Arr[] = new int[m];
         for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
         Solution ob = new Solution();
         System.out.println(ob.count(Arr, m, n));
     }
 }
}// } Driver Code Ends


//User function Template for Java

class Solution {
 public long count(int a[], int m, int n) {
     
     long dp[][]=new long[n+1][m+1];
     for(long[] d:dp){
         Arrays.fill(d,-1);
     }
     return solve(a,n,0,dp);
 }
 
 public long solve(int a[],int n,int i,long[][] dp){
     
     if(n==0){
         return 1;
     }
     if(i>=a.length||n<0){
         return 0;
     }
     if(dp[n][i]!=-1){
         return dp[n][i];
     }
     
     return  dp[n][i]= (long) solve(a,n-a[i],i,dp)+solve(a,n,i+1,dp);
     
 }
}