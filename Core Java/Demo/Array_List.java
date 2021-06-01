package com.onebill.java_basics.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		
		//Array List
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		//add elements
		arraylist.add(13);
		arraylist.add(29);

		arraylist.add(3);

		arraylist.add(10);

		arraylist.add(39);

		arraylist.add(20);

		arraylist.add(50);
		//different ways of interation
		System.out.println("------Normal way---------");
		System.out.println(arraylist);
		System.out.println("-------For loop---------");
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println("-------For each loop--------");
		for(Integer i:arraylist) {
			System.out.println(i);
		}
System.out.println("--------Iterator--------------");
Iterator<Integer> iterator = arraylist.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
System.out.println("--------List Iterator--------------");
ListIterator<Integer> listIterator = arraylist.listIterator() ;
while(listIterator.hasNext()) {
	System.out.println(listIterator.next());
}
System.out.println("-----Reverse List Iterator---------");
ListIterator<Integer> revlistITerator = arraylist.listIterator(arraylist.size());
while(revlistITerator.hasPrevious()) {
	System.out.println(revlistITerator.previous());
}

		
	}

}
