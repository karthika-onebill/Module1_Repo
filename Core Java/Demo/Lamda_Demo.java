package com.onebill.java_basics;

interface MyInterface {
	//void show();
	void toDisplay(int x);
}

/*
 * class MyClass implements MyInterface{
 * 
 * @Override public void show() { System.out.println("show method"); }
 * 
 * }
 */
public class Lamda_Demo {

	public static void main(String[] args) {

		MyInterface ref = (int x) -> {
			System.out.println("print = " + x);
		};
		/*
		 * MyInterface ref = new MyInterface() {           //boilerplate code
		 * 
		 * @Override public void show() { System.out.println("This is show method"); }
		 * };
		 */
		ref.toDisplay(20);

	}

}
