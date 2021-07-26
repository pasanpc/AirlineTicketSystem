package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userDB {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String uid, String pass) {
		
		try {
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where uName='"+uid+"' and pass='"+pass+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
	} 
	
	public static List<User> getUser(String userName) {
		
		ArrayList<User> user = new ArrayList<>();
		
		try {
			
			con = DBconnection.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where uName='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				int id = rs.getInt(1);
			    String fname = rs.getString(2);
			    String lname = rs.getString(3);
			    String userN = rs.getString(4);
			    String nic = rs.getString(5);
			    String phone = rs.getString(6);
			    String email = rs.getString(7);
			    String address1 = rs.getString(8);
			    String password1 = rs.getString(9);
				
				User use = new User(id, fname, lname, userName,nic,phone, email, address1, password1);
				user.add(use);
			}
			
		} catch (Exception e) {
			
		}
		
		return user;	
	}
	
	
	 public static boolean insertuser(String fname, String lname, String userName, String password, String nic, String phone, String email, String address1) {
		 
		 boolean isSuccess = false;
			
			try {
				
				con = DBconnection.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into user values (0,'"+fname+"','"+lname+"','"+userName+"','"+nic+"','"+phone+"', '"+email+"', '"+address1+"','"+password+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
		 
		 return isSuccess;
		 
		 
	 }
	 
	 public static boolean userUpdate(String fname, String lname, String username, String password, String nic, String phone, String email, String address) {
		 
		 try {
	    		
	    		con = DBconnection.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update user set fName= '"+fname+"', lName= '"+lname+"', uName= '"+username+"', nic= '"+nic+"', phone= '"+phone+"', email= '"+email+"', address= '"+address+"', pass= '"+password+"'" + "where uName= '"+username+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
		 
		 return isSuccess;
	 }
	 
	 public static List<User> getUserDetails(String username) {
	    		    	
	    	ArrayList<User> use = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBconnection.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from user where uName='"+username+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String fname = rs.getString(2);
				    String lname = rs.getString(3);
				    String userN = rs.getString(4);
				    String nic = rs.getString(5);
				    String phone = rs.getString(6);
				    String email = rs.getString(7);
				    String address1 = rs.getString(8);
				    String password1 = rs.getString(9);
	    			
	    			User u = new User(id, fname, lname, username,nic,phone, email, address1, password1);
	    			use.add(u);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	
	    	return use;
	    	
	 }
	 
	 public static boolean deleteUser(String username) {
	    	
	    	
	    	try {
	    		
	    		con = DBconnection.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from user where uName='"+username+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if (rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	

}
