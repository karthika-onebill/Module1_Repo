package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Insert_Element_In_Array {

	public static void main(String[] args) {
		
		int position,limit,value;                         //[1,2,4,5] => [1,2,3,4,5]  :position :2 a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		limit = sc.nextInt();
		int a[] = new int[limit+1];
		for(int i=0;i<limit;i++) {
			System.out.println("Enter : ");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the value to insert : ");
		value = sc.nextInt();
		System.out.println("Enter the position : ");
		position = sc.nextInt();
		for(int i=limit-1;i>=position-1;i--) {
			a[i+1]=a[i];
		}
		a[position]=value;
		for(int x:a)
			System.out.println(x);
		
	}

}
