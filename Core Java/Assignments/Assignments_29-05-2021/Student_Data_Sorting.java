/*
 * Demonstrating Student Sorting  based on id,name,marks  and age
 *  
 *  user_input  => id,name,marks,age (using switch case filter the option)
 *  
 *  Datastructure => TreeSet
 *  
 *  FunctionalInterface => Comprator (Compare(obj1,obj2))
 */
package com.onebill.java_basics.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Student_Data_Sorting {

	public static void main(String[] args) {

		ArrayList<Student> obj = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		String[] sub = new String[] { "Tamil", "English", "Maths", "Science", "SocialScience" };
		// adding data
		System.out.println("Enter the number of students : ");
		int size = sc.nextInt();
		List<Integer> marks = new ArrayList<>(5);
		int[][] m = new int[size][5];
		String[] res = new String[size];

		for (int i = 0; i < size; i++) {
			int sum = 0;
			System.out.println("Enter the Student Reg_no  : ");
			int reg_no = sc.nextInt();
			System.out.println("Enter the Student name  : ");
			String name = sc.next();
			System.out.println("Enter the Marks:");
			res[i] = " { ";
			for (int j = 0; j < 5; j++) {
				System.out.print(sub[j] + " : ");
				int t = sc.nextInt();
				sum += t;
				res[i] += t + ",";
			}
			res[i] += " } ";
			System.out.println("Enter the Age: ");
			int age = sc.nextInt();

			obj.add(new Student(reg_no, name, res[i], age, sum));

		}

		System.out.println("---------Sorting----------------");
		System.out.println(" 1: Student ID\n 2: Student Name\n 3: Student Age\n 4: Student Marks\n Enter the choice :");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: // student Id
			System.out.println("-----sort by student reg_id----------");
			Collections.sort(obj, new Student_ID_Sorting());

			break;
		case 2: // student name
			System.out.println("-----sort by student name----------");
			Collections.sort(obj, new Student_Sort_byname());

			break;
		case 3: // sort by age
			System.out.println("-----sort by student age----------");
			Collections.sort(obj, new Student_Sort_byAge());

			break;
		case 4: // sort by marks

			System.out.println("-----sort by student total marks----------");
			Collections.sort(obj, new Student_Sort_byAge());

			break;
		}

		for (Student s : obj) {
			System.out.println(s);
		}

	}

}
