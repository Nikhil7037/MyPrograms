package com.io.Matrix;

import java.util.Scanner;

public class Transpose {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int n=sc.nextInt();
				a[i][j]=n;
				//System.out.println(a[i][j]+" ");
				b[j][i]=a[i][j];
				//System.out.println(b[j][i]+" ");
			}
			//System.out.println();
		}
		
		 for (int i = 0; i < a.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < a[i].length; j++) { //this equals to the column in each row.
	           // System.out.print(a[i][j] + " ");
	            System.out.print(b[i][j] + " ");
	         }
	         System.out.println();
	}
	}

}
