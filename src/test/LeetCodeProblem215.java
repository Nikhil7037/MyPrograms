package test;

import java.util.Arrays;

public class LeetCodeProblem215 {
	public static void main(String args[])
	{
		int a[]= {3,2,1,5,6,4};
		int b1=a.length;
		Arrays.sort(a);
		int b[]=new int[b1];
		for(int i=a.length;i<=0;i--)
		{
			for(int j=0;j<b1;j++ )
			{
				b[j]=a[i];
			}
		}
	}

}
