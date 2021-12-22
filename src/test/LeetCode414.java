package test;

import java.util.Arrays;

public class LeetCode414 {
	public static void main(String args[])
	{
		int a[]= {4,3,2,1};
		int b[]= {1,2};
		int size=a.length;
		int c[]=new int[size];
		int size1=b.length;
		int i=2;
		int t=0;
		if(size<1)
		{
			Arrays.sort(a);
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=a[i+1])
				{
					c[t]=a[i];
					t++;
				}
			}
		System.out.println(a[i]);
		}
		else
			System.out.println(b[size1-1]);
			
	}

}
