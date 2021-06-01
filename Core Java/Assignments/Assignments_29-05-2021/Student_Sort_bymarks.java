package com.onebill.java_basics.assignments;

import java.util.Comparator;

public class Student_Sort_bymarks implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		
		return obj1.sum-obj2.sum;
	}
	
       
	

}
