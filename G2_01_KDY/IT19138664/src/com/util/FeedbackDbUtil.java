package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FeedbackDbUtil {

	public static boolean insertFeedback(String name, String feedback)
	{
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/air_line";
		String user = "root";
		String password = "1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "insert into feedback values (0,'"+name+"','"+feedback+"')";
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
	
	public static List<InsertedFeedback> validate(String name, String feedback)
	{
		ArrayList<InsertedFeedback> InFeed = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/air_line";
		String user = "root";
		String password = "1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "Select * from feedback where name='"+name+"' and feedback='"+feedback+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next())
			{
				int id = rs.getInt(1);
				String Fname = rs.getString(2);
				String Feedback = rs.getString(3);
				
				InsertedFeedback f = new InsertedFeedback(id,Fname,Feedback);
				InFeed.add(f);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return InFeed;
	}
	
	public static boolean updateFeedback(String id,String name,String feedback) {
		
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/air_line";
		String user = "root";
		String password = "1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "update feedback set name='"+name+"',feedback='"+feedback+"' where idfeedback='"+id+"'";
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
	
	public static List<InsertedFeedback> getFeedback(String id)
	{
		int convertedId= Integer.parseInt(id);
		
		ArrayList<InsertedFeedback> UpFeed = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/air_line";
		String user = "root";
		String password = "1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "Select * from feedback where idfeedback='"+convertedId+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int Id = rs.getInt(1);
				String Fname = rs.getString(2);
				String Feedback = rs.getString(3);
				
				InsertedFeedback f = new InsertedFeedback(Id,Fname,Feedback);
				UpFeed.add(f);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return UpFeed;
	}
	

	public static boolean deleteFeedback(String id)
	{
		int convertedId= Integer.parseInt(id);
		
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/air_line";
		String user = "root";
		String password = "1234";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql = "Delete from feedback where idfeedback='"+convertedId+"'";
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
