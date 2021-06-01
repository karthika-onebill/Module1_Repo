package com.onebill.java_basics.assignments;

public class Student implements Comparable<Student> {

	int s_id;
	String s_name;
	int marks;

	public Student(int s_id, String s_name, int marks) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.marks = marks;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "s_id  : " + s_id + "\t s_name : " + s_name + "\t marks : " + marks + "";
	}

	public boolean equals(Object o) {

		if (o != null && o instanceof Student) {
			String name = ((Student) o).getS_name();

			if (name != null && name.equals(this.s_name)) {

				return true;
			}
		}

		return false;
	}

	@Override
	public int hashCode() {

		return this.s_name.hashCode();
	}

	@Override
	public int compareTo(Student o) {

		if (o.s_id == this.s_id)
			return 0;
		else if (o.s_id > this.s_id)
			return 1;
		else
			return -1;
	}

}
