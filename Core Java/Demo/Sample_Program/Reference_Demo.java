package com.onebill.corejava.basics;

class Reference {
	String name = "Karthika"; // local variable

	String display() {
		return name;
	}
}

public class Reference_Demo {
	static int  age = 10; // instance variable

	public static void main(String[] args) {
		Reference r = new Reference(); // reference variable
		System.out.println("Reference variable  :" + r);
		System.out.println("Local variable : " + r.display());
		System.out.println("Instance variable : " + age);
	}

}
