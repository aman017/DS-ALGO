package dynamicProgramming;

import java.util.Arrays;

public class GoldMineProb {

	 static int[][] dp=new int[51][51];
	    static int maxGold(int n, int m, int M[][])
	    {
	        for(int[] d:dp){
	            Arrays.fill(d,-1);
	        }
	        int sum=0;
	        for(int i=0;i<n;++i){
	              sum=Math.max(sum,solve(M,i,0,dp));
	        }
	        return sum;
	    }
	    
	    static int solve(int a[][],int i, int j,int dp[][]){
	        
	        if(i==a.length)
	        return 0;
	        if(j==a[0].length)
	        return 0;
	    
	    if(dp[i][j]!=-1)
	    return dp[i][j];
	        
	        return dp[i][j]=a[i][j]+Math.max(Math.max(solve(a,i,(j+1),dp),solve(a,Math.max(i-1,0),j+1,dp)),solve(a,i+1,j+1,dp));
	       
	    }

}
