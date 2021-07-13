package com.xworkz.touristplaces.bean;

import java.io.Serializable;

public class TouristPlaceBean implements Serializable{

	private int id;
	private String name;
	private String location;
	private double ticket;
	
	public TouristPlaceBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	
	
	public TouristPlaceBean(String name) {
		super();
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTicket() {
		return ticket;
	}

	public void setTicket(double ticket) {
		this.ticket = ticket;
	}
	
	
}
