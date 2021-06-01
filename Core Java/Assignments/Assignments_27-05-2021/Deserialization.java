/*
 * Deserailization - convert byte stream to object / platform independent
 * 
 */
package com.onebill.java_basics.assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialization {

	public static void main(String[] args) throws Exception, IOException {

		// byte stream to object
		// input the file
		FileInputStream fin = new FileInputStream("/home/karthika/Documents/s_text.txt");
		// passing file to object
		ObjectInputStream obj = new ObjectInputStream(fin);
		Student s1 = (Student) obj.readObject(); // bytestreams(file) to string
		System.out.println("Student data : \n Reg_no : " + s1.reg_no + " Name : " + s1.name);

		fin.close(); // close the input stream
		System.out.println("Success!");

	}

}
