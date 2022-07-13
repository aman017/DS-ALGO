package dynamicProgramming;

public class FriendsPairing {
	
	//formula: f(n)=f(n-1)+(n-1)*f(n-2)
	//f(n-1) -> no of ways to be single
	//f(n-2) -> no of ways to be in pair
	 public long countFriendsPairings(int n) 
	    { 
		 long[] dp=new long[n+1];
	      
	      for(int i=0;i<=n;++i){
	          if(i<=2)
	          dp[i]=i;
	          else
	          dp[i]=(dp[i-1]+((i-1)*dp[i-2])%1000000007)%1000000007;
	      }
	      return dp[n]%1000000007;
	      
	    }

}
