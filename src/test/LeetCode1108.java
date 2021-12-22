package test;

public class LeetCode1108 {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		String s="1.1.1.1";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='.')
			{
				sb.append("[.]");
				
			}
			else
				sb.append(c[i]);
		}
		System.out.println(sb.toString());
	}
	

}
