package com.admin;

public class Admin {
	
	
private int flightid;
private String depAir;
private String arrAir;
private String depDate;
private String arrDate;
private String airline;
private String price;



public Admin(int flightid, String depAir, String arrAir, String depDate, String arrDate, String airline, String price) {

	this.flightid = flightid;
	this.depAir = depAir;
	this.arrAir = arrAir;
	this.depDate = depDate;
	this.arrDate = arrDate;
	this.airline = airline;
	this.price = price;
}

public int getFlightid() {
	return flightid;
}

public String getDepAir() {
	return depAir;
}

public String getArrAir() {
	return arrAir;
}

public String getDepDate() {
	return depDate;
}

public String getArrDate() {
	return arrDate;
}

public String getAirline() {
	return airline;
}

public String getPrice() {
	return price;
}

	
	
	
	
}


