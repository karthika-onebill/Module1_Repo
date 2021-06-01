package com.onebill.corejava.basics;

class Data {
	String name, dept;

	public Data() {
		this.name = "Not known";
		this.dept = "Not known";

	}

	public Data(String name) {
		this();  //
		this.name = name;
	}

	public Data(String name, String dept) {
		this();
		this.name = name;
		this.dept = dept;

	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", dept=" + dept + "]";
	}
}

public class Student {

	public static void main(String[] args) {
		Data d = new Data();
		Data d1 = new Data("Karthika");
		Data d2 = new Data("karthika", "cse");
		System.out.println(d.toString());

		System.out.println(d1.toString());

		System.out.println(d2.toString());

	}
}
