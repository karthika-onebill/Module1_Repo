package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Matrix_Addition {

	public static void main(String[] args) {
		
		//Matrix addition
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
		if(row==row1 && col==col1) {
		int mat[][] = new int[row][col];

		int mat1[][] = new int[row1][col1];
		int sum[][] = new int[row][col];
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
		
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					sum[i][j]=mat[i][j]+mat1[i][j];
				}
			}
			System.out.println(" Output Matrix :");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(sum[i][j]);
				}
				System.out.println();
			}
			
			
		}
		else
			System.out.println("Addition need same row and column size");
	}

}
