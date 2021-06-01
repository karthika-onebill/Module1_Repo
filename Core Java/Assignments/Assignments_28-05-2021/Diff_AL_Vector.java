package com.onebill.java_basics.assignments;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Diff_AL_Vector {

	public static void main(String[] args) {
		
		/*
		 *  Arraylist - non sync ; 50% double the size ;fast ; supports iterator only
		 *  
		 * 
		 */
		
			
		
		List<Integer> list = new ArrayList<Integer>(4);
		list.add(1);
		list.add(2);
		list.add(3);

		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.size());  //50% only increase
		System.out.println(list);
		System.out.println("-------AL display using iterator--------");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		 * 
		 *  Vectorlist - sync ; 100% double the size ;slow ; supports iterator and Enumeration
		 * 
		 * 
		 */
		Vector<Integer> vector = new Vector<Integer>(4);
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(1);
		vector.add(2);
		vector.add(3);
		System.out.println("size : "+vector.size());
		System.out.println("capacity : "+vector.capacity());
		System.out.println("---display using iterator-------");
		Iterator<Integer> it1 = vector.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("----display using enumeration-----");
		Enumeration< Integer> en = vector.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
