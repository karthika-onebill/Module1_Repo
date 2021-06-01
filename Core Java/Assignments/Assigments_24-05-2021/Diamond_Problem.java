/*
 * 
 *   Diamond problem : Java doesnot support multiple inheritance
 *   
 *   can't extend more than one class to another class
 *   
 *   soln : interface
 * 
 */
package com.onebill.java_basics.assignments;

class Sample1{
	void show() {
		System.out.println("This is sampe1 class");
	}
}
class Sample2{
	void show() {
		System.out.println("this is sample2 class");
	}
}

public class Diamond_Problem extends Sample1, Sample2 {   // diamond problem 

	public static void main(String[] args) {
		

	}

}
