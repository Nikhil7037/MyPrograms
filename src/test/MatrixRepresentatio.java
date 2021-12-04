package test;

import java.util.Scanner;

public class MatrixRepresentatio {
public static void main(String args[])
{
	int a[][]= new int[3][3];
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			int t=sc.nextInt();
			a[i][j]=t;
			System.out.println(a[i][j]);
		}
	}
}
}
