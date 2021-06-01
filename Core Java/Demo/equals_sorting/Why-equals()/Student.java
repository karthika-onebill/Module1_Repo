package com.onebill.corejava.collectionsdemo;

public class Student {
	
	String registerNumber;
	
	public Student(String registerNumber) {
		this.registerNumber=registerNumber;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	public boolean equals(Object o) {
		if(o!=null && o instanceof Student) {
			String regNumber = ((Student)o).getRegisterNumber();
			if(regNumber!=null && regNumber.equals(this.registerNumber)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return this.registerNumber.hashCode();
	}

}
