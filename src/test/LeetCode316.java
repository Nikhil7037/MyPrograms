package test;

import java.util.Arrays;

public class LeetCode316 {
	public static void main(String args[])
	{
		String s="aabc";
		int len=s.length();
		System.out.println(len);
		char a[]=s.toCharArray();
		Arrays.sort(a);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				sb.append(a[i]);
			}
		}
		sb.append(a[len-1]);
		System.out.println(sb.toString());
	}

}
