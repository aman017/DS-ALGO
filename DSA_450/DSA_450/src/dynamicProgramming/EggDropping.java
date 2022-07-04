package dynamicProgramming;

public class EggDropping {
	
	static int[][] dp=new int[201][201];
    static int eggDrop(int e, int f) 
	{
	    // your code here
        if(e==1||f==1)
        return f;
        
        if(dp[e][f]!=0)
        return dp[e][f];
        int val=Integer.MAX_VALUE;
        for(int k=1;k<=f;++k){
           val= Math.min(val,
           Math.max(eggDrop(e-1,k-1)//egg break
            ,eggDrop(e,f-k)));//egg not break
        }
        return dp[e][f]=val+1;
	}

}
