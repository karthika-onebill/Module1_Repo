package com.onebill.java_basics;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

interface DateInterface{
	
	int process();  //abstract method
	static LocalDate formatDate(LocalDate date) {
		return date;                      //normal method
	}
	default String displayDate(LocalDate date) {
		return date.toString();                //normal method
	}
	default int toDo(int a,int b) {         //normal method
		return a+b;
	}
	
}

public class Lamda_Date {

	public static void main(String[] args) {
		DateInterface ref = ()-> 100;
		System.out.println(ref.process());
		LocalDate d = LocalDate.now();
		
		System.out.println(DateInterface.formatDate(d));
		System.out.println(ref.displayDate(d));
		System.out.println(ref.toDo(10, 5));
		
	}

}
