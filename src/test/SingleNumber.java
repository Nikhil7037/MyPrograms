package test;

public class SingleNumber {
	
	public boolean test(int a[])
	{
		int temp=0;
		for(int x:a)
		{
			int count=0;
			temp=x;
			for(int temp1:a)
			{
				if(temp1==temp)
					count++;
				
			}
			if(count>1)
				return true;
		}
		return false;
	}
public static void main(String args[])
{
	int a[]= {1,3,2,};
	SingleNumber single=new SingleNumber();
	
	System.out.println(single.test(a));
	
	}
	
}



