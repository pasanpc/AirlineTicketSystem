package com.util;

public class InsertedFeedback {
	
	private String name;
	private String feedback;
	private int id;
	
	public InsertedFeedback(int Id, String name, String feedback) {
		this.id = Id;
		this.name = name;
		this.feedback = feedback;
	}

	
	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public String getFeedback() {
		return feedback;
	}

		
}
