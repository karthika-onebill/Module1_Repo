package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		//search the element present or not
		
		int size,search_element,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		size = sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		//read search element
		System.out.println("Enter the search element : ");
		search_element = sc.nextInt();
		
		for(int i=0;i<size;i++) {
			if(a[i]==search_element)
					s=1;
		}
		System.out.println((s==1)?"Search Element is Exist":"Search Element is not Exist" );
	}

}
