package com.onebill.java_basics.assignments;

import java.util.Scanner;
class Sorting{
	
	public void toSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j])
					min=j;
			}
			int t = a[i];
			a[i]=a[min];
			a[min]=t;
		}
	
	}
	
}
public class Second_Small_Big_Array {

	public static void main(String[] args) {
		//find the second smallest and second largest element in array
		int size,ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		Sorting ss = new Sorting();
		ss.toSort(a);
		
	
		System.out.println(" 1 : Second Smallest Element \n 2 : Second Largest Element \n Enter the choice :");
		ch=sc.nextInt();
		switch(ch) {
		case 1 : //Second smallest element
			
			System.out.println("Second smallest Elemet is :"+a[1]);
			break;
		case 2 : //Second largest element
			System.out.println("Second largest Element is : "+a[a.length-2]);
			break;
		default : System.out.println("Try other choice");
		
		}
	}
	

}
