package com.io.Matrix;

import java.util.Scanner;

public class FirstMatrix {
	public static void main(String args[])
	{
		final int[][] matrix = new int[2][2];
		int columns=matrix[0].length;
		Scanner sc=new Scanner(System.in);
		int n;
		 for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < columns; j++) { //this equals to the column in each row.
	          n=sc.nextInt();
	          matrix[i][j]=n;
	         }
	         System.out.println();
		 }
		 for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
	            System.out.print(matrix[i][j] + " ");
	         }
	         System.out.println();
	}
	}
}

