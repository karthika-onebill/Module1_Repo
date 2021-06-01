package com.onebill.jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Create_OneBillBankTable {
	static Connection con;
	static Statement stat;

	public static void main(String[] args) {

		try {
			// 1. load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// 2.establish db connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillBankDB", "root", "karthika13");
			// 3.issue the queries
			String query = "create table OneBillBankDB.employee(empid int primary key,empname varchar(50),empsalary int)";
			stat = con.createStatement();
			// 4.process the result
			int res = stat.executeUpdate(query);
			
		
				System.out.println("Table created Successfully!");
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				// 5. close all jdbc objects
				if (con != null)
					con.close();
				if (stat != null)
					stat.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
