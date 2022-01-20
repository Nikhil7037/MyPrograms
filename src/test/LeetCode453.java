package test;

public final class LeetCode453 {
	public static void main(String args[])
	{
		int nums[]= {1,2,3};
		
		int n=nums.length;
		int min=Integer.MAX_VALUE;
		int ans=0;
		
		
		for(int i=0;i<n;i++)
		{
			min=Math.min(min, nums[i]);
			System.out.println(min);
		}
		
		for(int i=0;i<n;i++)
		{
			ans+=nums[i]-min;
			System.out.println(ans);
		}
	}

}
