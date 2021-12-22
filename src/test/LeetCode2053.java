package test;

public class LeetCode2053 {
	public static void main(String args[])
	{
		String arr[]={"d","b","c","b","c","a"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			String t=arr[i];
			System.out.println(t);
			for(int j=0;j<arr.length;j++)
			{
				if(t==arr[j])
				{
					flag=true;
				}
			}
			System.out.println(flag);
		}
		
	}

}
