package com.onebill.jdbc.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_delete_dynamic {

	static Connection con;
	static PreparedStatement pstat;

	public static void main(String[] args) {
		try {
			// 1.load the driver
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 2.get conn db
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13");

			String query = "delete from Student where sid=?";
			pstat = con.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id : ");
			int s_id = sc.nextInt();

			pstat.setInt(1, s_id);

			int res = pstat.executeUpdate();
			if (res > 0) {
				System.out.println("Student Record deleted succesfully!");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
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
