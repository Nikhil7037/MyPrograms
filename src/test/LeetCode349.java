package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {
	public static int[] main(String args[])
	{
		int nums1[]= {2,3,4,5};
		int nums2[]= {2,3};
		Set<Integer> set=new HashSet();
		Set<Integer> result=new HashSet();
		
		for(int n:nums1)
		{
			set.add(n);
		}
		for(int n:nums2)
		{
			if(set.contains(n))
			{
				result.add(n);
			}
		}
		  return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
