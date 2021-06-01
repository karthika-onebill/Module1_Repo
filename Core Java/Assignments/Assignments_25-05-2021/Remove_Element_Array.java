package com.onebill.java_basics.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_Element_Array {

	public static void main(String[] args) {
		//remove element in specidic location           // a={0,1,2,3,4}  =>  p :2 => {0,1,3,4}
		int limit,position;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		limit = sc.nextInt();
		int a[]=new int[limit];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position : ");
		position = sc.nextInt();
		 //Manual Code
		for(int i=position;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
	
		
		for(int i=0;i<a.length-1;i++)
			System.out.println(a[i]);
		

	}
	

}
