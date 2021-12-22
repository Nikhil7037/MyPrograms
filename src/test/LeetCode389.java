package test;

public class LeetCode389 {
	public static void main(String args[])
	{
		String s="abc";
		String s1="ab";
		char a[]=s.toCharArray();
		char a1[]=s1.toCharArray();
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]!=a1[i])
		{
			sb.append(a[i]);
		}
			
		}
		System.out.println(sb.toString());
	}

}
