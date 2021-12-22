package test;

import java.util.Scanner;

public class LeetCode1672 {
	public static void main(String args[])
	{
		int temp=0;
		int temp1=0;
		int a[][]= new int[2][2];
		Scanner sc=new Scanner(System.in);
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				n=sc.nextInt();
				a[i][j]=n;
			}
			System.out.println();
		}
		
		 for (int i = 0; i < a.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < a[i].length; j++) {//this equals to the column in each row.
	        	 temp=temp+a[i][j];
	            //System.out.print(a[i][j] + " ");
	        	
	         }
	         if(temp1<temp)
	         {
	         temp1=temp;
	         }
	         temp=0;
	         System.out.println(temp1);
	        // System.out.println();
	}
	}

}
