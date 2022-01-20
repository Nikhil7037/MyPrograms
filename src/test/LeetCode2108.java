package test;

public class LeetCode2108 {
	public static void main(String args[])
	{
		String arr[]= {"abc","aaa","def"};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			String temp=arr[i];
			char[] temp1=temp.toCharArray();
			for(int j=temp1.length-1;j<=0;j--)
			{
				System.out.println(temp1[j]);
				sb.append(temp1[j]);
			}
			System.out.println(sb.toString());
			if(sb.toString()==temp)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
