package com.onebill.java_basics.array_list;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//add elements
		arrayList.add(20);
		arrayList.add(34);
		//add elements in particular index
		System.out.println(arrayList);
		arrayList.add(2,56);
		System.out.println(arrayList);
		//replace element using add
		arrayList.add(2,45);
		System.out.println(arrayList);
		arrayList.add(67);
		arrayList.add(94);
		//replcae
		arrayList.set(2, 95);
		System.out.println(arrayList);
		//sublist
		List<Integer> sublist =arrayList.subList(1, 3);
		System.out.println(sublist);
	}

}
