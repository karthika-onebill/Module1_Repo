package com.onebill.corejava.basics;

import java.util.Scanner;

public class Emp_details {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//name
		
		String name = sc.nextLine();
		//age
		int age = sc.nextInt();
		//gender
		char gender =sc.next().charAt(0);
		//salary
		double salary = sc.nextDouble();
		//long
		long mob_no =sc.nextLong();
		System.out.println("Name : "+name+"\nage : "+age+"\nGender : "+gender+"\nMobile_no : "+mob_no+"\nsalary : "+salary);
		sc.close(); //pooling the memory
	}

}
