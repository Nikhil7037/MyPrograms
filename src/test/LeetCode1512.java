package test;

public class LeetCode1512 {
public static void main(String args[])
{
	int a[]= {1,2,3,1,1,3};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
	}
	System.out.println(count);
}
}
