package test;

import java.util.ArrayList;
import java.util.List;

public class LeetCode34 {
	public static void main(String args[])
	{
		int a[]= {5,7,7,8,8,10};
		int l=a.length;
		//int b[]=new int[l];
		List list=new ArrayList();
		int target=8;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			count=i;
			if(a[i]==target)
			{
				list.add(i);
			}
			
			//System.out.println(list);
			list.toArray();
			//System.out.println(list);
		}
		System.out.println(list.get(list.size()-1));
	}

}
