package com.onebill.java_basics.array_list;
import java.util.*;
public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();
		list.add(12);
		list.add(34);
		list.add(36);
		list.add(90);
		System.out.println(list);
		System.out.println("-------add with index--------");
		list.add(1,23);
		list.add(2,90);
		System.out.println(list);
		System.out.println("-------remove the index/ object------");
		list.remove();    //it remove the first defaultly
		list.remove(1);  //remove the value in index
		list.remove(new Integer(12)); //remove the object
		System.out.println(list);
		System.out.println("--------set the index---------");
		list.set(1, 99);
		System.out.println(list);
		list.add(100);
		list.add(66);
		//contains
		java.util.LinkedList<Integer> slist = new java.util.LinkedList<Integer>();
		slist.add(1);
		System.out.println(slist.contains(list));
		System.out.println("------add first--------");
		slist.addFirst(34);
		System.out.println(slist);
		System.out.println("--------add last---------");
		slist.addLast(11);
		System.out.println(slist);
		
	}

}
