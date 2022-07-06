package dynamicProgramming;

public class LargestContSubarray {
	
	 long maxSubarraySum(int a[], int n){
	        
	        // Your code here
	        int ans=0,sum=0,nmax=Integer.MIN_VALUE;
	        for(int i=0;i<n;++i){
	            nmax=Math.max(nmax,a[i]);
	            if(sum+a[i]>0){
	                sum+=a[i];
	                ans=Math.max(ans,sum);
	            }else{
	                sum=0;
	            }
	        }
	        if(ans==0)
	        return nmax;
	        
	        return ans;
	    }

}
