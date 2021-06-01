package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Dynamic_Update {
   static Connection con=null;
   static PreparedStatement pstat = null;
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillStudent?user=root&password=karthika13");
			String query = "update Student set sname=?,marks=? where sid=2";
			pstat = con.prepareStatement(query);
			String s_name = args[0];
			int s_mark = Integer.parseInt(args[1]);
			pstat.setString(1, s_name);
			pstat.setInt(2, s_mark);
			boolean flag = pstat.execute();
			System.out.println("Flag values : "+flag);
			if(flag==false)
				System.out.println("Updated Succesfully!");
			else
				System.out.println("No updated!");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

		finally {
			try {
				if(con!=null) con.close();
				if(pstat!=null) pstat.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
