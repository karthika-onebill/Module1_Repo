/*
 *   Student Registration : Collect necessary details of students
 *   
 *   if the student age is <12  and weight is <35 kilos not eligible for registration
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.Scanner;

//Create custom Exception 

class Student_Exception extends Exception {
	public Student_Exception(String string) {
		super(string); // passing msg
	}

}
//Checking Eligibility

class Eligibility {

	static void toCheck(int age, double weight) throws Student_Exception {

		if (age < 12 || weight < 35.0) {
			throw new Student_Exception("Not Eligible for Registration !");
		}

		else {
			System.out.println("Registered Successfully!");
		}

	}
}

public class Student_Registration {

	public static void main(String[] args) {

		int age; // student age
		double weight; // student weight
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		age = sc.nextInt();
		System.out.println("Enter the weight : ");
		weight = sc.nextDouble();
		try {
			Eligibility.toCheck(age, weight);
		} catch (Student_Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
