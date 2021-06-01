package com.onebill.java_basics.assignments;

public class Difference_Equals {

	public static void main(String[] args) {
		
		//Find the differenc ebetween equals and == in string object
		String s1 = new String("Java Programming");
		String s2 = "Java Programming";
		//equals
		
			System.out.println("Equals () : "+s1.equals(s2)); //looking for value
			System.out.println("==  : "+(s1==s2));          //looking for reference
	}

}
