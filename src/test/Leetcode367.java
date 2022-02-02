package test;

public class Leetcode367 {
	public static void main(String args[])
	{
		int num=17;
		int start=2;
		
		int mid,end=num;
		
		if(num<2)
		{
			System.out.println("true");		}
	while(start<=end)
	{
		mid=start+(end-start)/2;
		
		if(mid==((float)num/mid))
				{
			System.out.println(true);
				}
		else if(mid<(num/mid))
		{
			start=mid+1;
		}
		else
		{
			end=mid-1;
		}
	}
	
	}
}
