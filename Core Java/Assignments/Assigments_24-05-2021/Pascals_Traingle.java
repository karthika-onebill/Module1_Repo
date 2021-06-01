/*
 *  Pascal's Traingle
 *  
 *  n=4
 *  
 *  	1          0c0          => ncr = n! /r!*(n-r)!
 *    1   1       1c0  1c1
 *   1  2 1      2c0  2c1 2c2
 *  1 3  3 1    3c0  3c1 3c2 3c3
 * 
 */

package com.onebill.java_basics.assignments;

import java.util.Scanner;
class Factorial{
public int fact(int n) {
	if(n==0)
		return 1;
	else
		return n*fact(n-1);
}
}

public class Pascals_Traingle {

	public static void main(String[] args) {
		int n,no=0;
		Scanner sc = new Scanner(System.in);
		Factorial f = new Factorial();
		System.out.println("Enter the Limit : ");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
		  for(int j=0;j<n-i;j++) {
			  System.out.print(" ");
		  }
		  for(int j=0;j<=i;j++) {
			  System.out.print(" "+(f.fact(i))/(f.fact(i-j)*(f.fact(j))));
		  }
		  System.out.println();
		}
	}

}
