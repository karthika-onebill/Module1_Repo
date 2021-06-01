/*
 *   LinkedHashSet  - is a Hashtable and Linked list implementation of the set interface.
 *                  - It inherits HashSet class and implements Set interface.
 * 
 * The important points about Java LinkedHashSet class are:

			-  Java LinkedHashSet class contains unique elements only like HashSet.
            -  Java LinkedHashSet class provides all optional set operation and permits null elements.
            -  Java LinkedHashSet class is non synchronized.
            -  Java LinkedHashSet class maintains insertion order.
 */
package com.onebill.java_basics.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Book {
	int page_no;
	String book_name;
	String author_name;

	public Book(int page_no, String book_name, String author_name) {
		super();
		this.page_no = page_no;
		this.book_name = book_name;
		this.author_name = author_name;
	}

	@Override
	public String toString() {
		return "page_no=" + page_no + "\t book_name=" + book_name + "\t author_name=" + author_name + "";
	}

}

public class Linked_Hash_Set {

	public static void main(String[] args) {

		LinkedHashSet<Book> obj = new LinkedHashSet<Book>();
		obj.add(new Book(1, "OS", "Silbertez"));
		obj.add(new Book(2, "Compiler", "FeelFreetoLearn"));
		obj.add(new Book(3, "DAA", "John"));
		obj.add(new Book(4, "DS", "Romeo"));

		Iterator<Book> book = obj.iterator();
		System.out.println("-----Display Book Information----------");
		while (book.hasNext()) {
			System.out.println(book.next());
		}

	}

}
