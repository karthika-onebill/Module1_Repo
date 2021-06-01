/*
 *  LinkedHashMap - is Hashtable and Linked list implementation of the Map interface.
 *                - with predictable iteration order. 
 *                - It inherits HashMap class and implements the Map interface.
 * 
 *                 - Java LinkedHashMap contains values based on the key.
				   - Java LinkedHashMap contains unique elements.
				   - Java LinkedHashMap may have one null key and multiple null values.
				   - Java LinkedHashMap is non synchronized.
				   - Java LinkedHashMap maintains insertion order.
				   - The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 */
package com.onebill.java_basics.assignments;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linked_Hash_Map {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> obj = new LinkedHashMap<Integer, String>();
		obj.put(101, "Karthika");
		obj.put(102, "Ramesh");
		obj.put(103, "Kumar");
		obj.put(104, "Raja");
		obj.put(105, "Vel");
		Set<Map.Entry<Integer, String>> ref = obj.entrySet();
		System.out.println("--Display linked hash map-------");

		for (Entry<Integer, String> r : ref) {
			System.out.println(r.getKey() + " - " + r.getValue());

		}

		System.out.println("-----Display keys only-------");
		Set<Integer> keys = obj.keySet();
		for (Integer k : keys) {
			System.out.println(k);
		}
		System.out.println("-----Display values only-------");
		Collection<String> val = obj.values();
		for (String k : val) {
			System.out.println(k);
		}

	}

}
