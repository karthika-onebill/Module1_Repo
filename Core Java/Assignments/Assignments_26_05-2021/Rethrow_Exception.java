/*
 *  Rethrow Exception : One catch can manually throw an exception which can be handled by another catch block
 * 
 * 
 */
package com.onebill.java_basics.assignments;

public class Rethrow_Exception {

	public static void temp() {
		try {
			int base = 0;
			for (int i = 1; i < 10; i++) {
				int q = i / base;
			}

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Calling......");
			throw (e); // manually throw the another catch block exception from one catch
		}
	}

	public static void main(String[] args) {

		try {
			temp();

		} catch (Exception e) {
			System.out.println("General Exception Calling.....");
		}

	}

}
