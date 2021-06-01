package com.onebill.java_basics.array_list;

public class LinkedListString {

	public static void main(String[] args) {
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
		list.add("Hrml");
		list.add("sql");
		list.add("Java");
		list.add("python");
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println("set the value--------");
		list.set(1, "nodejs");
		System.out.println(list);
	}

}
