/*
 *   Consumer Interface  - functional interface defined under java.util.function  package
 *   
 *   					 -  It contains an abstract accept() and a default andThen() method.
 *   
 *                       - It can be used as the assignment target for a lambda expression or method reference.
 * 
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Stream_API {

	public static void message(String name) {
		System.out.println("Welcome to " + name);
	}

	public static void value(int no) {
		System.out.println("This is value : " + no);
	}

	public static void main(String[] args) {

		Consumer<String> consumer = Consumer_Stream_API::message;
		consumer.accept("Onebill");
		Consumer<Integer> consumer_int = Consumer_Stream_API::value;
		consumer_int.accept(23);

		Consumer<List<Integer>> list = l -> {
			for (int i = 0; i < l.size(); i++) {
				l.set(i, 2 * l.get(i));
			}
		};
		Consumer<List<Integer>> displaylist = l -> l.stream().forEach(a -> System.out.println(a + " "));

		List<Integer> newlist = new ArrayList<Integer>();
		newlist.add(23);
		newlist.add(12);
		newlist.add(90);
		newlist.add(11);
		list.andThen(displaylist).accept(newlist);

	}

}
