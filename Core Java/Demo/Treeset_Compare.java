package com.onebill.java_basics.array_list;

import java.util.TreeSet;

public class Treeset_Compare {

	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>(new ComparatorEmployee());
		ts.add(new Employee(101,"Karthika","Trichy"));
		ts.add(new Employee(102,"Ram","Chenai"));
		ts.add(new Employee(103,"Guna","Madurai"));
		ts.add(new Employee(104,"Sundari","Bangalore"));
		System.out.println(ts);
		for(Employee e :ts) {
			
			System.out.println(e.emp_name);
			
			System.out.println(e.emp_add);
		}
	}

}
