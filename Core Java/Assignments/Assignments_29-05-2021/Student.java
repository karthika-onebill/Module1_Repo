package com.onebill.java_basics.assignments;

import java.util.Arrays;
import java.util.List;

public class Student {


	
		int s_id;
		String s_name;
		String marks;
		int age;
		int sum;
		public Student(int s_id, String s_name, String marks, int age,int sum) {
			super();
			this.s_id = s_id;
			this.s_name = s_name;
			this.marks = marks;
			this.age = age;
			this.sum=sum;
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
		public int getSum() {
			return sum;
		}
		public void setSum(int sum) {
			this.sum = sum;
		}
		public String getMarks() {
			return marks;
		}
		public void setMarks(String marks) {
			this.marks = marks;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			
			
			return " Student id : " + s_id + "\tStudent name : " + s_name + "\tStudent marks : " +marks+ "\t Total Marks : "+sum+"\tStudent age : " + age + "\n";
		}
		
	

}
