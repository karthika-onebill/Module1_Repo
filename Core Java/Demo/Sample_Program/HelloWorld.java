package com.onebill.corejava.basics;

import java.io.IOException;
import static java.lang.System.*;

public class HelloWorld {

	public static void main(String args[]) throws IOException {
		out.println("Hii");
		out.println("Welcome");
		if(false && true && true) {
			System.out.println("Nothing to print!!");
		}
		else {
			System.out.println("Print!");
			
		}
		if(true || false || false) 
			System.out.println("Print!!");
		else 
			System.out.println("No Print");
	}
}
