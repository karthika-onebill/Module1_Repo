package com.onebill.java_basics.assignments;

import java.awt.List;
import java.util.ArrayList;

public class Duplicates_Array {

	public static void main(String[] args) {
		//duplicates arrray
		int cnt;
		int a[] = new int[] {1,2,2,3,3,4,4};
		int temp[]=new int[8];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
			else {
				System.out.println("Duplicate element is :"+a[i]);
			}
			
		}
		temp[j++]=a[a.length-1];
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}
		
		
	}

}
