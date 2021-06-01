package com.onebill.java_basics.assignments;

import java.util.Scanner;
class Ascending_Order_String{
	
	public void toSort(String[] a) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min].compareTo(a[j])>0)
					min=j;
			}
			String t = a[i];
			a[i]=a[min];
			a[min]=t;
		}
		for(String x:a)
			System.out.println(x);
	}
	
}
class Desceding_Order_String{
	public void toSort(String[] a) {
		for(int i=0;i<a.length;i++) {
			int max=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[max].compareTo(a[j])<0)
					max=j;
			}
			String t = a[i];
			a[i]=a[max];
			a[max]=t;
		}
		for(String x:a)
			System.out.println(x);
	}
	
	
}

public class Sort_String_Array {

	public static void main(String[] args) {
		//sorting string elements
		int size,ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		size=sc.nextInt();
		String[] a = new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter : ");
			a[i]=sc.next();
		}
		Ascending_Order_String as = new Ascending_Order_String();
		Desceding_Order_String ds = new Desceding_Order_String();
		//sorting
		System.out.println("Sorting Operation :\n 1 : Ascending Order \n 2 : Descending Order \n Enter the choice :");
		ch=sc.nextInt();
		switch(ch) {
		case 1 : //ascending
			
			as.toSort(a);
			break;
		case 2 : //descending
			ds.toSort(a);
			break;
		default : System.out.println("Try other choice");
		
		}
		
	}

}
