/*
 *  user input : 1 2 3 //output : Ascending
 *  user input : 3 2 1 //output : Descending
 *  user input : 2 3 1 //output  : Neither
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PrintASCDESCOR {

	public static void main(String[] args) {
		int size; //size of array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sie of array: ");
		
		
		size = sc.nextInt();

		int[] input_array=new int[size];
		int[] temp_array = new int[size];
		int[] temp_array1 = new int[size];
		int[] rev_array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter :");
			input_array[i] = sc.nextInt();
		}
		//storing array
		
		temp_array = input_array.clone();
		temp_array1 = input_array.clone();

		
		//sorting
		for(int i=0;i<size;i++) {
			int min =i;
			for(int j=min;j<size;j++) {
				if(input_array[min]>input_array[j]) {
					min=j;
				}
				
			}
		int t = input_array[i];
		input_array[i]=input_array[min];
		input_array[min]=t;
			
		}
		
		//reverse of the array
		for(int i=0;i<size;i++) {
		
			rev_array[(size-1)-i]=input_array[i];
		
			
		}
		

		
		//display the output
		if(Arrays.equals(input_array, temp_array)) {
			//Ascending order
			System.out.println("Ascending order");
		}
		else if(Arrays.equals(temp_array, rev_array)) {
			//Descendig order
			System.out.println("Descending order");
			
		}
		else {
			System.out.println("Neither Ascending nor Descending order");
		}
	}


	

}
