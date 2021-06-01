package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		
		//Reverse the array elements
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		for(int i=size-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
