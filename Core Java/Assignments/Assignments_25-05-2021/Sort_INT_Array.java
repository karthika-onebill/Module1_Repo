package com.onebill.java_basics.assignments;

import java.util.Scanner;
class Ascending_Order{
	
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
		for(int x:a)
			System.out.println(x);
	}
	
}
class Desceding_Order{
	public void toSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int max=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[max]<a[j])
					max=j;
			}
			int t = a[i];
			a[i]=a[max];
			a[max]=t;
		}
		for(int x:a)
			System.out.println(x);
	}
	
	
}
public class Sort_INT_Array {

	public static void main(String[] args) {
		//sorting array elements in int type
		int size,ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		Ascending_Order as = new Ascending_Order();
		Desceding_Order ds = new Desceding_Order();
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
