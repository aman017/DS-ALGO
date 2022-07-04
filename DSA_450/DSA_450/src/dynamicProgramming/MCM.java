package dynamicProgramming;

import java.util.Arrays;

public class MCM {
	
	static int[][] dp=new int[101][101];
    static int matrixMultiplication(int n, int a[])
    {
        // code here
       
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return  solve(a,1,n-1);
    }
    
    static int solve(int[] a,int i,int j){
        if(j<=i)
        return 0;
        int val=Integer.MAX_VALUE;
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        for(int k=i;k<j;++k){
            int temp=solve(a,i,k)+solve(a,k+1,j)+a[i-1]*a[k]*a[j];
            val=Math.min(val,temp);
        }
        return dp[i][j]=val;
    }

}
