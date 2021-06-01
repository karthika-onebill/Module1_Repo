package com.onebill.java_basics.array_list;

import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		//trees set follows the natural order(sorting defaulty - not allow null values
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(200);
		ts.add(4000);
		ts.add(34);
		//ts.add(null); //cannot allows
		System.out.println(ts);
	}

}
