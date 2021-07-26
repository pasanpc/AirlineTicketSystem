package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CardDbUtil {

	public static boolean insertCard(String name,String CardNumber,String ExpDate,String CVV) 
	{
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/air_line";
		String user = "root";
		String password = "1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "insert into payment values (0,'"+name+"','"+CardNumber+"','"+ExpDate+"','"+CVV+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
}
