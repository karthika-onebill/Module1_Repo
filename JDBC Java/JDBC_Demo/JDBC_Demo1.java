package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Demo1 {

	static Connection conn = null;
	static Statement stat = null;
	static ResultSet res = null;

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13");
			String query = "select * from Student";
			stat = conn.createStatement();
			res = stat.executeQuery(query);
			while (res.next()) {
				int s_id = res.getInt("sid");
				String s_name = res.getString("sname");
				int s_marks = res.getInt("marks");
				System.out
						.println("Student id : " + s_id + " Student name : " + s_name + " Student marks : " + s_marks);
			}

		} catch (Exception e) {
			System.out.println("Error occured!");
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stat != null)
					stat.close();
				if (res != null)
					res.close();
			} catch (Exception e) {
				System.out.println("Error");
			}
		}
	}

}
