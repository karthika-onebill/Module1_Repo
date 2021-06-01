package com.onebill.corejava.basics;

class Overloading{
	void display(String name) {
		System.out.println("Name = "+name);
	}
	void display(String name,int age) {
		System.out.println("Name = "+name+"Age = "+age);
	}
}
public class Method_Overloading {
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.display("Karthika");
		o.display("Karthika",14);
		
		
	}
public static void main(int s) {
	System.out.println(s);
}
}
