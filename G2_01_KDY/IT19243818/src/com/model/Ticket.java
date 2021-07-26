package com.model;

public class Ticket {

    private int ticketId;
    private int flightId;
    private String depAir;
    private String arrAir;
    private String depDate;
    private String arrDate;
    private String airline;
    private Double price;
    private int custNo;
    private String tcls;
    
	public Ticket(int ticketId, int flightId, String depAir, String arrAir, String depDate, String arrDate,
			String airline, Double price, int custNo, String tcls) {
		super();
		this.ticketId = ticketId;
		this.flightId = flightId;
		this.depAir = depAir;
		this.arrAir = arrAir;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.airline = airline;
		this.price = price;
		this.custNo = custNo;
		this.tcls = tcls;
	}

	public int getTicketId() {
		return ticketId;
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

	public Double getPrice() {
		return price;
	}

	public int getCustNo() {
		return custNo;
	}

	public String getTcls() {
		return tcls;
	}

    
    
}