package com.onebill.java_basics;

import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		//using foreach lamda
		
		System.out.println("----display using lamda -foreach----");
		values.forEach(i->System.out.println(i));
System.out.println("-----display using :: operator--------");
values.forEach(System.out :: println);
	}

}
