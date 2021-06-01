/*
 *    Floyd's Triangle
 *    
 *    n = 4
 *    
 *    1
 *    2 3
 *    4 5 6
 *    7 8 9 10    //n=4 (no of rows :4 ; no of cols :4
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Generate_Floyds_Triangle {

	public static void main(String[] args) {
		int n;
		 int no=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

}
