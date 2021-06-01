package com.onebill.java_basics.array_list;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	int emp_id;
	String emp_name;
	String emp_add;
	public Employee(int emp_id, String emp_name, String emp_add) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_add = emp_add;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
				return o1.emp_name.compareTo(o2.emp_name) ;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_add=" + emp_add + "]";
	}

}
