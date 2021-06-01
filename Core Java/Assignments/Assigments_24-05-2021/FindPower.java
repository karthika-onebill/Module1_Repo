/*
 *   User input  : 3
 *   
 *   display     :  1^3 2^3 3^3 => 1 8 27 
 * 
 */

package com.onebill.java_basics.assignments;

import java.io.IOException;
import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) throws IOException {
		//read the input from user
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		for(int i=1;i<=number;i++) {
			//display the output
			int ans = (int)Math.pow(i, number);
			//System.out.print(i+"^"+ans+"  ");
			
			System.out.print(ans+" ");
		}

	}

}
