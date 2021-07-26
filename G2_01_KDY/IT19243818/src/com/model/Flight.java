package com.model;

public class Flight {

    private int flightId;
    private String depAir;
    private String arrAir;
    private String depDate;
    private String arrDate;
    private String airline;
    private double price;
    
    
	public Flight(int flightId, String depAir, String arrAir, String depDate, String arrDate, String airline,double price) {
		this.flightId = flightId;
		this.depAir = depAir;
		this.arrAir = arrAir;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.airline = airline;
		this.price = price;
	}

	public int getFlightId() {
		return flightId;
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

	public double getPrice() {
		return price;
	}

    
    
}
