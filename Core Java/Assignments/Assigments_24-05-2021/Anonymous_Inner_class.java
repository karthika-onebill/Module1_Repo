/*
 *  Implemeting anonymous classes
 * 
 */
package com.onebill.java_basics.assignments;
abstract class Sample_Class{
	abstract void show();
}

public class Anonymous_Inner_class {

	public static void main(String[] args) {
		Sample_Class c = new Sample_Class() {
			void show() {
				System.out.println("Hii this anonymous class");
			}
			
		};
		c.show();
		
	}

}
