package com.onebill.corejava.basics.Asessments;

import static java.lang.Math.*;

import java.util.Scanner;

public class Static_Import {
	public static void main(String[] args) {
		int a, b, c;
		double temp,res;
		// root of quatratic equation
		// x = -b +- root(b^2-4ac) / 2a
		// MATH and ROOT
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		a = sc.nextInt();

		System.out.println("Enter  b :");
		b = sc.nextInt();
		System.out.println("Enter c :");
		c = sc.nextInt();
		temp = sqrt(pow(b,2)-(4*a*c));
		res = ((-b)+temp)/(2*a);
		System.out.println("The answer is :"+res);

	}

}
