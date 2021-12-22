package test;

import java.util.Arrays;

public class LeetCode1200 {
	public static void main(String args[])
	{
		int a[]= {4,2,1,3};
		Arrays.sort(a);
		int diff=0;
		int temp=100000000;
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			diff=a[j]-a[i];
			if(temp>=diff)
			{
			temp=diff;	
			System.out.println(a[j]);
			System.out.println(a[i]);
		}
		}
		//Arrays.asList(null)
	}
}
}
