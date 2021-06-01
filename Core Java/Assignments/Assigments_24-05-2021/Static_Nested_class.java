/*
 * Static nested class
 * 
 */
package com.onebill.java_basics.assignments;
class MainClass{
	static int data =10;
	static class Inner{
		void show() {
			System.out.println("Hii this is inner class"+"Data is : "+data);
		}
	}
	void show() {
		System.out.println("This is outer class");
	}
}

public class Static_Nested_class {

	public static void main(String[] args) {
		MainClass.Inner inner = new MainClass.Inner();
		inner.show();
		
	}

}
