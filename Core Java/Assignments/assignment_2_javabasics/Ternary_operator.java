package com.onebill.corejava.basics.Asessments;

import java.io.IOException;
import java.util.Scanner;

//Eligible for voting
public class Ternary_operator {
	public static void main(String[] args) throws IOException {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		age = sc.nextInt();
		System.out.println((age>=18)? "ELigible for Voting" : "Not Eligible for voting");
	}

}
