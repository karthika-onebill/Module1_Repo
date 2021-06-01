package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_Dynamic_Query {

	static Connection con;
	static PreparedStatement pstat;
	static ResultSet res;
	public static void main(String[] args) {
		try {
			//1.load the driver
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//2.get conn db
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13");
			
			String query = "select * from Student where sid=?";
            pstat = con.prepareStatement(query);
            String id = args[0];
            int idd = Integer.parseInt(id);
            pstat.setInt(1, idd);
            res = pstat.executeQuery();
			if(res.next()) {
				int s_id = res.getInt("sid");
				String s_name = res.getString("sname");
				int s_mark = res.getInt("marks");
				System.out.println(s_id+s_name+s_mark);
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
				if (res != null)
					res.close();
			} catch (Exception e) {
				System.out.println("Exception Generated during close the JDBC objects!!");
			}
		}
		
	}

}
