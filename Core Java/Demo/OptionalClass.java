package com.onebill.java_basics;

import java.util.Optional;

public class OptionalClass {

	Integer sum(Optional<Integer> a,Optional<Integer> b) {
		System.out.println(" First Param : "+a.isPresent());
		System.out.println(" Second Param : "+b.isPresent());
		Integer firstValue =a.orElse(0);
		Integer secValue = b.orElse(0);
		return firstValue+secValue;
		
	}
	public static void main(String[] args) {
		OptionalClass c = new OptionalClass();
		Integer a = new Integer(34);
		Integer b =null;
		Optional<Integer> aa = a.;
		System.out.println(c.sum(a,b));
		
	}

}
