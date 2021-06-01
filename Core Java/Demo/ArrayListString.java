package com.onebill.java_basics.array_list;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Welcome");
		arrayList.add("To");
		arrayList.add("Onebill");
		String[] string = new String[arrayList.size()];
		for(int i=0;i<arrayList.size();i++) {
			string[i]=arrayList.get(i);
		}
		for(String x : string) {
			System.out.println(x);
		}
	}

}
