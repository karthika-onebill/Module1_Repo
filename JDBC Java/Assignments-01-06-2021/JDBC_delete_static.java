package com.onebill.jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_delete_static {

	static Connection con = null;
	static Statement stat = null;

	public static void main(String[] args) {
		try {
			// 1. loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			// 2.Create the DB connection via driver
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13");
			// 3.Execute the query
			String query = "Delete from Student where sid=2";
			stat = con.createStatement();
			int res = stat.executeUpdate(query);
			if (res > 0) {
				// 4. Process the result that are given by the query
				System.out.println("Deleted Successfully!!");
			}
		} catch (Exception e) {
			System.out.println("Exception Generated! checking the code!");
		} finally {
			try {
				// 5.close all jdbc objects
				if (con != null)
					con.close();
				if (stat != null)
					stat.close();
			} catch (Exception e) {
				System.out.println("Exception Generated during close the JDBC objects!!");
			}
		}
	}
}
