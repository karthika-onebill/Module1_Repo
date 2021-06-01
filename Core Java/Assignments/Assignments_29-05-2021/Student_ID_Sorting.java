package com.onebill.java_basics.assignments;

import java.util.Comparator;

public class Student_ID_Sorting implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.s_id-obj2.s_id;
		
	}
	

	

}
