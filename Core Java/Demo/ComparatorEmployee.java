package com.onebill.java_basics.array_list;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.emp_add.compareTo(o2.emp_add);
				//return o1.emp_name.compareTo(o2.emp_name) ;
		
		/*
		 * 
		 *  if(o1.id == o2.id) return 0;
		 *  else if(
		 */
	}
	

}
