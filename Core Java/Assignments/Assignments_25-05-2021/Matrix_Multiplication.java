package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {

		//Matrix multiplication
		int row,col,row1,col1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row1 limit : ");
		row = sc.nextInt();
		System.out.println("Enter the column1 limit : ");
		col = sc.nextInt();
		System.out.println("Enter the row2 limit : ");
		row1= sc.nextInt();
		System.out.println("Enter the column2 limit : ");
		col1 = sc.nextInt();
		if(col==row1) {
		int mat[][] = new int[row][col];

		int mat1[][] = new int[row1][col1];
		int mul[][] = new int[row][col1];
	System.out.println("Matrix 1 :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter : ");
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix 2 :");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				System.out.println("Enter : ");
				mat1[i][j]=sc.nextInt();
			}
		}
		
		//multiplication
		for(int i=0;i<row;i++) {
			for(int j=0;j<col1;j++) {
				int total =0;
				for(int k=0;k<row1;k++) {
					total +=mat[i][k]*mat1[k][j];
					
				}
				mul[i][j]=total;
				
			}
		}
		//display
		System.out.println(" Result Matrix : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col1;j++) {
				System.out.print(mul[i][j]);
			}
			System.out.println();
		}
		
	}
		else {
			System.out.println(" Not matched");
		}
	}

}
