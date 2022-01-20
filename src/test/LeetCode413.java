package test;

public class LeetCode413 {
	public static void main(String args[])
	{
		int nums[]= {1,2,3,4};
		 int[] dp=new int[nums.length];
	        int  arithmeticSubarraysCount=0;
	        
	        for(int i=2;i<nums.length;i++)
	        {
	            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
	            {
	            	System.out.println("i value is"+i);
	                dp[i]=dp[i-1]+1;
	                System.out.println(dp[i]);
	                System.out.println(dp[i-1]);
	                arithmeticSubarraysCount += dp[i];
	                
	            } 
	        }
	}

}
