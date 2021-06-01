package com.onebill.java_basics.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*
 *  hashSet - not supported to comparator
 * 
 */
public class Student_HashSet {

	public static void main(String[] args) {
		
		
		Student s1 =new Student(121,"Cithra",90);
		Student s2 =new Student(12, "Cithra", 89);
        Student s3 =new Student(31,"PoojaDevi",78);
        Student s4 =new Student(4,"Renuka",67);
		Student s5 =new Student(50,"RajaRam",99);
		System.out.println(s1.equals(s2));
	
		HashSet<Student> obj = new HashSet<Student>();
		//add data
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		obj.add(s5);
		System.out.println(obj.size());
		// display using iterator
		System.out.println("---------Display the student HashSet data ---------");
		Iterator<Student> iterator = obj.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		;
		System.out.println("---------Display the student HashSet data (sorting) based on reg_no---------");
		List<Student> s = new ArrayList<Student>(obj);
		Collections.sort(s);
		Iterator<Student> iterator1 = s.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}

}
