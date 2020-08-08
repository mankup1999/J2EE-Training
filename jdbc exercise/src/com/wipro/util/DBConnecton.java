package com.wipro.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnecton {
	public Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "password");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
