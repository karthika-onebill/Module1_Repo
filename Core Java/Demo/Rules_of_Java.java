package com.onebill.java_basics;

public class Rules_of_Java  implements B,C {
	//Class is given priority/precedence over the interface
	//subclass is given priority/precedence over the superclass
	public static void main(String[] args) {
		 Rules_of_Java obj = new Rules_of_Java();
		 obj.show();
		
	}
	

 public void show() {
	 C.super.show();
	 B.super.show();
	 System.out.println("This is show() in Rules_of_Java class");
 }
}
