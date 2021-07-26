package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	private static String url ="jdbc:mysql://localhost:3306/admin2?autoReconnect=true&useSSL=false";
	private static String username = "root";
	private static String password = "mihisuru1@#";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
		}
		catch(Exception e) {
			System.out.println("Database connection is not success");
			
		}
		return con;
			
	}

	
}
