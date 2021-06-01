package com.onebill.java_basics.assignments;

import java.io.FileOutputStream;

public class Try_With_Resources {

	public static void main(String[] args) {
		//try with resources
		/*
		 *   FileOutputStream is a resource that must be closed after the program is finished with it.
		 *    So, in this example, closing of resource is done by itself try.
		 *  
		 *   try(resources) {}
		 */
		try(FileOutputStream out = new FileOutputStream("/home/karthika/Documents/testing.txt")){
			String msg = "Welcome to try with resources!!";
			byte[] data = msg.getBytes();
			out.write(data);
			System.out.println("Message written succesfully!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
