package com.onebill.corejava.collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("s1234");
		Student s2 = new Student("s1234");
		System.out.println(s1.equals(s2));
		
		Map<Student, Marks> studentMarks = new HashMap<Student, Marks>();
		studentMarks.put(s1, new Marks());
		studentMarks.put(s2, new Marks());
		
		System.out.println(studentMarks.size());

	}

}
