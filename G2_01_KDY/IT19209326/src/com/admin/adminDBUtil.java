package com.admin;


import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;



import java.sql.Statement;

public class adminDBUtil {
	
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
    
	 public static boolean insertadmin(String flightid, String depAir, String arrAir, String depDate, String arrDate, String airline, String price) {
    	
    	boolean isSuccess = false;
    	
    	
    	
    	try {
    		con = DBconnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into user values ('"+flightid+"','"+depAir+"','"+arrAir+"','"+depDate+"','"+arrDate+"' ,'"+airline+"','"+price+"')";
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

	public static List<Admin> showadmin() {
		
		ArrayList<Admin> ad = new ArrayList<>();
		
		try {
			
			con = DBconnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "select * from user";
    		rs = stmt.executeQuery(sql);
    		
    		
    		while(rs.next()) {
    			
    			int fid = rs.getInt(1);
    			String depair = rs.getString(2);
    			String arrair = rs.getString(3);
    			String depdate = rs.getString(4);
    			String arrdate = rs.getString(5);
    			String airline = rs.getString(6);
    			String price = rs.getString(7);
    			
    			Admin a = new Admin(fid , depair,arrair,depdate,arrdate,airline,price);
    			ad.add(a);
    			
    		}
    		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return ad;
	}
	
	
} 
    