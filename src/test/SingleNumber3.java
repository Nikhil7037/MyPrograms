package test;

import java.util.Arrays;

public class SingleNumber3 {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		String s=" Hello World ";
		String a[]=s.split("\\s");
	
		int len=a.length;
		String b[]=new String[len];
		for(int i=0,j=a.length-1;i<a.length && j>=0;i++,j--)
		{
		  b[i]=a[j];	
		 // System.out.println(b[i]);
		  sb.append(b[i]+" ");
		}
		System.out.println(sb.toString());
		}
	
	}

