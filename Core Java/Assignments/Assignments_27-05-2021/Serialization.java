/* 
 *   Serialization  - is a mechanism of converting  state of an object to byte streams
 *   
 *  DeSerialization -  is the reverse process where the byte stream is used to recreate the actual Java object in memory.
 *                 - 
 * The byte stream created is platform independent.
 * So, the object serialized on one platform can be deserialized on a different platform.
 * 
 * 
 *   Serializable   - Marker Interface ( no methods are there) - used to access the subclasses
 *   
 *  
 *   
 *   ObjectOutputStream() -> methods :  writeObject() / flush() / close()  => Serializable
 *   
 *   ObjectInputStream() -> methods  :  readObject()  / close()          => Deserializable
 *   
 *   
 * 		Advantages of Serialization :
 * 
			1. To save/persist state of an object.
			2. To travel an object across a network.
 */

package com.onebill.java_basics.assignments;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int reg_no;
	String name;

	public Student(int reg_no, String name) {
		super();
		this.reg_no = reg_no;
		this.name = name;
	}

}

public class Serialization {

	public static void main(String[] args) throws IOException {

		Student s1 = new Student(101, "Karthika Velmurugan");
		// string to object
		// open the file
		FileOutputStream fout = new FileOutputStream("/home/karthika/Documents/s_text.txt");
		// passing file to object
		ObjectOutputStream obj = new ObjectOutputStream(fout);
		obj.writeObject(s1); // string to store bytestreams(file)
		obj.flush(); // flushes the output stream
		obj.close(); // close the output stream
		System.out.println("Success!");

	}

}
