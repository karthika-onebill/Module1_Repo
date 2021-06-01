/*
 * sum of odd N Natural numbers
 * 
 *  user input :  limit (ex:11)
 *  
 *  1+3+5+7+9+11 = 36
 */
package com.onebill.java_basics.assignments;

import java.util.Scanner;

class Calculation{
	public int toFindSum(int limit) {
		int sum =0;
		for(int i=1;i<=limit;i+=2) {
			sum+=i;
		}
		return sum;
	}
}
public class Sum_Of_NaturalNumbers {

	public static void main(String[] args) {
		
		//user input
		int limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		limit = sc.nextInt();
		Calculation cc = new Calculation();
		System.out.println("Ans is :"+cc.toFindSum(limit));
	}

}
