package com.onebill.java_basics.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Person> pobj = new ArrayList<Person>();
		pobj.add(new Person(111, "Karthika"));
		pobj.add(new Person(13,"Ramya"));
		pobj.add(new Person(1,"Bharathy"));
		
		//Collections.sort(pobj);
		
		for(Person p :pobj) {
			System.out.println(p.getP_no()+" "+p.getP_name());
		}
		
		
	}

}
