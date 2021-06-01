/*
 *  Generating pyramid 
 *  
 *  pattern is :
 *  user input : 5
 *  
 *      1
 *     2 2 
 *    3 3 3
 *   4 4 4 4
 *  5 5 5 5 5       => row : 5 ; col :5
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Generate_Pyramid {

	public static void main(String[] args) {
		int n; 
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
