package com.util;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Ticket;
import com.util.DBConnect;


public class TicketDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

		
    public static boolean bookticket(String flightId, String depAir, String arrAir, String depdate, String arrDate, String airline,String price,String custNo,String tcls) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "insert into ticket values (0,'"+flightId+"','"+depAir+"','"+arrAir+"','"+depdate+"','"+arrDate+"','"+airline+"','"+price+"','"+custNo+"','"+tcls+"')";
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
 	

	public static List<Ticket> validateTicket(String custNo) {
		
		int convertedId = Integer.parseInt(custNo);
	
		ArrayList<Ticket> tick = new ArrayList<>();

		try {
	
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from ticket where custNo = '"+convertedId+"'";
			rs = stmt.executeQuery(sql);
	
			while(rs.next()) {
				int ticketNo = rs.getInt(1);
				int flightId = rs.getInt(2);
				String depaAir = rs.getString(3);
				String arriAir = rs.getString(4);
				String depDate = rs.getString(5);
				String arrDate = rs.getString(6);
				String airline = rs.getString(7);
				double price = rs.getDouble(8);
				int custno = rs.getInt(9);
				String ticketcls = rs.getString(10);
		
				Ticket t = new Ticket(ticketNo,flightId,depaAir,arriAir,depDate,arrDate,airline,price,custno,ticketcls);
				tick.add(t);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return tick;

	}
    public static boolean updateticket(String ticketId, String flightId, String depAir, String arrAir, String depDate, String arrDate,String airline,String price,String custNo,String tcls) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update ticket set flightId='"+flightId+"',depAir='"+depAir+"',arrAir='"+arrAir+"',depDate='"+depDate+"',arrDate='"+arrDate+"',airline='"+airline+"',price='"+price+"',custNo='"+custNo+"',ticketClass='"+tcls+"'where ticketId='"+ticketId+"'";
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
    public static List<Ticket> getTicketDetails(String custNo) {
		
		int convertedId = Integer.parseInt(custNo);
	
		ArrayList<Ticket> tick = new ArrayList<>();

		try {
	
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from ticket where custNo = '"+convertedId+"'";
			rs = stmt.executeQuery(sql);
	
			while(rs.next()) {
				int ticketNo = rs.getInt(1);
				int flightId = rs.getInt(2);
				String depaAir = rs.getString(3);
				String arriAir = rs.getString(4);
				String depDate = rs.getString(5);
				String arrDate = rs.getString(6);
				String airline = rs.getString(7);
				double price = rs.getDouble(8);
				int custno = rs.getInt(9);
				String ticketcls = rs.getString(10);
		
				Ticket t = new Ticket(ticketNo,flightId,depaAir,arriAir,depDate,arrDate,airline,price,custno,ticketcls);
				tick.add(t);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

		return tick;

	}
    
    public static boolean deleteticket(String ticketId,String custNo) {
    	
    	int convertedTickId = Integer.parseInt(ticketId);
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from ticket where ticketId='"+convertedTickId+"'";
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
}