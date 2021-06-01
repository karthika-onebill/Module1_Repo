package com.onebill.java_basics.array_list;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		
		java.util.HashSet<Integer> hs = new java.util.HashSet<Integer>();
		hs.add(100);
		hs.add(500);
		hs.add(300);
		System.out.println(hs);
		hs.add(null);
		hs.add(null);
		hs.add(100);
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs);
		System.out.println("Size :"+hs.size());
		Iterator<Integer> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
