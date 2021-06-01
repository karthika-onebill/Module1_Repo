package com.onebill.java_basics.array_list;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMap {

	public static void main(String[] args) {
		java.util.TreeMap<Employee, Integer> m = new java.util.TreeMap<Employee,Integer>(new ComparatorEmployee());
		m.put(new Employee(101, "Karthika", "chennai"),1);
		m.put(new Employee(102,"Guna","Coimabtore"),2);
		Set<Map.Entry<Employee,Integer>> s = m.entrySet();
		for(Entry<Employee, Integer> e :s) {
			System.out.println(e);
		}
		Set<Employee> keyvalues = m.keySet();
		for(Employee e :keyvalues) {
			System.out.println(e.emp_id+"\n"+e.emp_name+"\n"+e.emp_add);
		}
	}

}
