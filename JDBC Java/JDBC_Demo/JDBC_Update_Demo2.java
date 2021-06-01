package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update_Demo2 {

	static Connection con = null;
	static Statement stat = null;

	public static void main(String[] args) {

		try {

			// 1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2.Get the Db connection via driver
			String db_url = "jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13";
			con = DriverManager.getConnection(db_url);
			// 3.Issue the sql queries
			String query = "update Student set sname='Ramya' where sid=1";
			stat = con.createStatement();
			int res = stat.executeUpdate(query);
			// 4.process the query
			System.out.println("Updated! " + res);

		} catch (Exception e) {
			System.out.println("Error occured");
		} finally {
			// 5.close the jdbc objects
			try {
				if (con != null)
					con.close();
				if (stat != null)
					stat.close();
			} catch (Exception e) {
				System.out.println("Error");
			}
		}

	}

}
