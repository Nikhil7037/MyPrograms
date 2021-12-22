package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode350 {
public static void main(String args[])
{
	int arr1[]= {1,2,3};
	int arr2[]= {2,1};
	List<Integer> list=new ArrayList();
	List<Integer> list2=new ArrayList();
	
	for(int i:arr1)
	{
		list.add(i);
	}
	
	for(int i:arr2)
	{
		if(list.contains(i))
		{
			list2.add(i);
		}
	}
	Set<Integer> targetSet = new HashSet<>(list2);
	Object[] k=targetSet.toArray();
	int k1[]=new int[k.length];
	for(int i=0; i<k.length; i++){
        k1[i] = (int) k[i];
     }
}
}
