package com.onebill.java_basics.assignments;

import java.util.Comparator;

public class Student_Sort_byAge implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		
		return a.age-b.age;
	}
	


}
