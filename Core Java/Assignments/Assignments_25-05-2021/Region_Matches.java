package com.onebill.java_basics.assignments;

public class Region_Matches {

	public static void main(String[] args) {
		//find out the substring contain the mai string or not
		
		String s1 = "Hi welcome to onebill";
		String s2 = "to";
		if(s1.regionMatches(11,s2,0,2)) {
			System.out.println("Matched");
			
		}
		else {
			System.out.println("Not matched!");
		}
	}

}
