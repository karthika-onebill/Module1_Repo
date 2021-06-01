package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Dynamic_Query_Insert {

	static Connection con;
	static PreparedStatement pstat;
	
	public static void main(String[] args) {
		try {
			//1.load the driver
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//2.get conn db
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13");
			
			String query = "insert into Student values(?,?,?)";
            pstat = con.prepareStatement(query);
            String id = args[0];
            String name = args[1];
            String mark = args[2];
            int idd = Integer.parseInt(id);
            int marks = Integer.parseInt(mark);
            pstat.setInt(1, idd);
            pstat.setString(2, name);
            pstat.setInt(3, marks);
           int res  = pstat.executeUpdate();
			if(res>0) {
				System.out.println("Student Record inserted succesfully!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				// 5.close all jdbc objects
				if (con != null)
					con.close();
				if (pstat != null)
					pstat.close();
			} catch (Exception e) {
				System.out.println("Exception Generated during close the JDBC objects!!");
			}
		}
		
	}
}
