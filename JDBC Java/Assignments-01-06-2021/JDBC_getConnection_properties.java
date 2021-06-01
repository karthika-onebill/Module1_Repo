package com.onebill.jdbc.assignments;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBC_getConnection_properties {

	static Connection con;
	static Statement stat;
	static ResultSet res;

	public static void main(String[] args) {

		try {
			// loading the properties file
			Properties prop = new Properties();
			InputStream in = new FileInputStream(
					"/home/karthika/eclipse-workspace/Assignment_01_06_2021/src/com/onebill/jdbc/assignments/jdbc.properties");
			prop.load(in);

			String driver_url = prop.getProperty("MYSQLJDBC.driver");

			// 1. load the driver
			Class.forName(driver_url);
			String db_url = prop.getProperty("MYSQLJDBC.url");
			String user = prop.getProperty("MYSQLJDBC.username");
			String password = prop.getProperty("MYSQLJDBC.password");
			// 2.establish db connection
			System.out.println(db_url+user+password);
			con = DriverManager.getConnection(db_url, user, password);
			// 3.issue the queries
			String query = "select * from employee";
			stat = con.createStatement();
			// 4.process the result
			res = stat.executeQuery(query);
			while (res.next()) {
				int emp_id = res.getInt("empid");
				String emp_name = res.getString("empname");
				int emp_salary = res.getInt("empsalary");
				System.out.println(emp_id + " " + emp_name + " " + emp_salary + " ");
			}

			System.out.println("Table created Successfully!");
			prop.clear();

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
