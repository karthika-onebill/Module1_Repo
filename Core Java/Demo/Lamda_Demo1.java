package com.onebill.java_basics;

interface FunctionalInt {
	void abstractnomalMethod() ; //abstract
	//java1.8 featur
	default void defaultMethod() {
		System.out.println("I am in default method!!");
	}
	static void staticMethod() {
		System.out.println("I am in static method");
	}
}
public class Lamda_Demo1 {

	public static void main(String[] args) {
 FunctionalInt obj = () ->{System.out.println("I am in abstractnomalMethod ");};/*new FunctionalInt() {
	
	@Override
	public void nomalMethod() {
		System.out.println("I am in normal method");  //boiler plate code
		
	}
};*/
obj.abstractnomalMethod();
obj.defaultMethod();
FunctionalInt.staticMethod();

	}

}
