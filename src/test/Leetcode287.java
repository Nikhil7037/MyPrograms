package test;

import java.util.ArrayList;

public class Leetcode287 {
	public static void main(String args[])
	{
		int a[]= {1,2,2,3};
		int k=0;
		ArrayList list=new ArrayList();
		for(int i:a)
		{
			list.add(i);
		}
		
		for(int i:a)
		{
			if(list.contains(i))
			{
				k++;
			}
		}
		
}
}