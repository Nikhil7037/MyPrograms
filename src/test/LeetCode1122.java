package test;

public class LeetCode1122 {
	public static void main(String args[])
	{
		int arr1[]= {2,3,1,3,2,4,6,7,9,2,19};
		int l=arr1.length;
		int arr2[]= {2,1,4,3,9,6};
		int m=arr2.length;
		int arr3[]=new int[l+m];
		for(int i=0;i<arr2.length;i++)
		{
			int t=arr2[i];
			for(int j=0;j<arr1.length;j++)
			{
				if( t==arr1[j])
				{
					arr3[j]=t;
				}
			}
		}
	}

}
