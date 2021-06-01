package com.onebill.com.basics;

import java.util.Scanner;

// Autoboxing- to convert primitive to non primitive (int to string)
public class Auto_Boxing {
	public static void main(String[] args) {
int prim_value;
		Integer non_prim_value;
		System.out.println("Enter the primitive data to perform autoboxing :");
		Scanner sc= new Scanner(System.in);
		prim_value = sc.nextInt();
		//autoboxing
		
		non_prim_value=prim_value;
		System.out.println("The autoboxing (to convert primitive to non-primitive data type ,the final soln is :"+non_prim_value);
	}

	
}
