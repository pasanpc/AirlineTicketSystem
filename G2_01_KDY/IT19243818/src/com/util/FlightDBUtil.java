package com.util;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.util.DBConnect;
import com.model.Flight;


public class FlightDBUtil {
	
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
    public static List<Flight> validate(String depAir, String arrAir,String depdate,String arrdate) {
    	
	ArrayList<Flight> fli = new ArrayList<>();
	
	try {
		
	    con = DBConnect.getConnection();
	    stmt = con.createStatement();
		String sql = "select * from flight where depAir like '%"+depAir+"%' and arrAir like '%"+arrAir+"%' and depDate = '"+depdate+"' and arrDate = '"+arrdate+"'";
	    rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int flightid = rs.getInt(1);
			String depaAir = rs.getString(2);
			String arriAir = rs.getString(3);
			String depDate = rs.getString(4);
			String arrDate = rs.getString(5);
			String airline = rs.getString(6);
			double price = rs.getDouble(7);
			
			Flight f = new Flight(flightid,depaAir,arriAir,depDate,arrDate,airline,price);
			fli.add(f);
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return fli;

}
}