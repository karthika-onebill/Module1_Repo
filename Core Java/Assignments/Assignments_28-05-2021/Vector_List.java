/*
 *  Vector  - is like a dynamic array which grow shrink based on need.
 *  		- there is no size limit
 *          - java.util.Collection  
 *          - List Interface
 *          - recommended for Thread-safe only
 *           -synchronized
 *           - 
 * 
 * 
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(2); // here size: 5 (capacity :8) => if enter to 6th
														// size..automatically grown by 2 size
		// using add method
		vector.add("C-Programming");
		vector.add("Java");
		vector.add("Ruby");
		// using addElement() method
		vector.addElement("Python");
		vector.addElement("NodeJS");
		// display the vector list
		System.out.println(vector);

		// display using iterator
		System.out.println("---display using Iterator----------");
		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------display using Enumerator------");
		Enumeration<String> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		// size of the vector
		System.out.println("Size  : " + vector.size());
		// capacity of vector
		System.out.println("Capacity : " + vector.capacity());
		// firstelelment
		System.out.println("First Element : " + vector.firstElement());
		// last element
		System.out.println("Last Element  : " + vector.lastElement());

		// remove by index
		System.out.println("removing by index(2) : " + vector.remove(2));
		// remove by value
		System.out.println("remove by value (Python) : " + vector.remove(new String("Python")));

		System.out.println("-------after removing-------");
		System.out.println(vector);
		System.out.println(" getting the particular element : " + vector.get(0));
	}

}
