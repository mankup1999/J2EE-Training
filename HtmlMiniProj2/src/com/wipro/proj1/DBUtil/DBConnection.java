package com.wipro.proj1.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userProject", "root", "password");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

//	public static void main(String[] args) {
//
//		Connection con = new DBConnection().getConnection();
//		System.out.println(con);

//	}

}
