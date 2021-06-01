package com.onebill.java_basics.array_list;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<String,Integer> h = new java.util.HashMap<String,Integer>();
		h.put("One",1);
		h.put("Two",2);
		h.put("Three", 3);
		h.put("Four", 4);
		//iteration is slow in hashmap 
		 Set<Map.Entry<String,Integer>> entry =h.entrySet();
		 for(java.util.Map.Entry<String, Integer> m :entry) {
			 System.out.println(m);
		 }
		//print all values
		 Set<String> values = h.keySet();
		 for(String string :values) {
			 System.out.println(string);
		 }
		 //collection
		 Collection<Integer> values1 = h.values();
		 for(Integer in :values1) {
			 System.out.println(in);
		 }
	}

}
