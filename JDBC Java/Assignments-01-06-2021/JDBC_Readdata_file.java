package com.onebill.jdbc.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_Readdata_file {

	static Connection con;
	static PreparedStatement pstat;

	public static void main(String[] args) {
		try {
			// 1.load the driver
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 2.get conn db
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13");

			String query = "insert into Student values(?,?,?)";
			pstat = con.prepareStatement(query);

			// read the input from file

			FileReader read = new FileReader(
					"/home/karthika/eclipse-workspace/Assignment_01_06_2021/src/com/onebill/jdbc/assignments/file.txt");
			BufferedReader bread = new BufferedReader(read);
			// read the data line by line
			String lineData = null;
			String[] data = null;
			while ((lineData = bread.readLine()) != null) {
				data = lineData.split(" ");
				System.out.println(lineData);
			}
			pstat.setInt(1, Integer.parseInt(data[0]));
			pstat.setString(2, data[1]);
			pstat.setInt(3, Integer.parseInt(data[2]));

			int res = pstat.executeUpdate();
			if (res > 0) {
				System.out.println("Student Record deleted succesfully!");
			}
			read.close();
			bread.close();
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
