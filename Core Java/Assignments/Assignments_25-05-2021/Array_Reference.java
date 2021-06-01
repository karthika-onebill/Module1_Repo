package com.onebill.java_basics.assignments;

public class Array_Reference {

	public static void main(String[] args) {
		
		//try array reference
		int num1[]=new int[] {21,42,23,11,53,2,55,29,90,57};
		int num2[];
		//copy the reference
		num2=num1;
		//modify the data
		num2[9]=100;
		System.out.println(" Num 1 array : ");
		for(int x:num1)
			System.out.print(" "+x);
		System.out.println();
		System.out.println(" Num 2 array : ");

		for(int x:num2)
			System.out.print(" "+x);
	}

}
