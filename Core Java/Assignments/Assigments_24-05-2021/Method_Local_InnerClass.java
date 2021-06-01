/*
 *  Method local inner class
 *  
 *  
 * 
 */
package com.onebill.java_basics.assignments;
class Outer{
	class Inner{
		void show() {
			System.out.println("this is inner class");
		}
	}
	void showOut(){
		System.out.println("This is outer class");
		Inner inner = new Inner();
		inner.show();
	}
}

public class Method_Local_InnerClass {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.showOut();
	}

}
