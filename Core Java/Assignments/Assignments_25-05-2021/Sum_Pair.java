package com.onebill.java_basics.assignments;

import java.util.Scanner;

public class Sum_Pair {

	public static void main(String[] args) {
		
		// sum : 10 =>  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 => (1+9) (10)(2+8)(3+7)(4+6)(5+5)
		
		int sum ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		sum = sc.nextInt();
		int a[]=new int[15];
		int k=1;
		for(int i=0;i<15;i++) {
			a[i]= k;
			k++;
		}
		for(int i=0;i<15;i++) {
			for(int j=i;j<15;j++) {
				if((a[i]+a[j]) == sum ) {
					System.out.println("( "+a[i]+"+"+a[j]+" )");
				}
				
				
			}
			if(a[i]==sum) {
				System.out.println("( "+a[i]+" )");
			}
		}
		
	
		
	}

}
