package com.onebill.java_basics.assignments;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_In_Descending_Order {

	public static void main(String[] args) {

		// Tree set => it ordering the data defaulty (Ascending order)
		// coding for display Tree set elements in descending order
		TreeSet<String> t = new TreeSet<String>();
		// adding elements to Tree set
		t.add("Onebill");
		t.add("Zoho");
		t.add("TechYantra");
		t.add("TCS");
		t.add("CTS");
		t.add("IBM");

		// display the treeset elements
		System.out.println("----Tree set prints in Ascending order (Default)---------");
		for (String s : t) { // it prints in ascending order defaulty
			System.out.println(s + " ");
		}

		// try to display in descending order (way 1)

		TreeSet<String> rev = (TreeSet<String>) t.descendingSet();
		System.out.println("----way 1-----Tree prints in Descending order (descendingSet())--------");
		for (String s : rev) {
			System.out.println(s + " ");
		}

		// try to display in descending order (way 2)
		Iterator<String> iterator = t.descendingIterator();
		System.out.println("----way 2-----Tree prints in Descending order (descendingIterator())--------");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
