package com.onebill.java_basics.assignments;

public class String_Immutable {

	public static void main(String[] args) {
				
			 //string literal
				String s1 = "Java";
				//String pool : s1 -> ref1 -> Java
				s1.concat("Programming");  // no memory allocated still s1 -> ref1 ->java
				System.out.println(s1);
				s1=s1.concat("Programming");  //new memory allocated : again s1 -> ref2->javaProgramming 
				/*
				 * 
				 * s1 have ref1 : java ref2:javaProgramming ,but actually is mutable s1 -> ref1->javaProgramming 
				 * but here is immutable so,,create new ref ,once the ref created canot be changed and modified
				 */
				System.out.println(s1);
				
				
			

	}

}
