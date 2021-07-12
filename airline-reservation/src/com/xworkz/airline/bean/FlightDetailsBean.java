package com.xworkz.airline.bean;

import java.io.Serializable;

public class FlightDetailsBean implements Serializable{

	private int flightId;
	private String flightName;
	private String source;
	private String destination;
	private String flightClass;
	private int seat;
	
	
	public FlightDetailsBean(int flightId, String flightName, String source, String destination, String flightClass,
			int seat) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.flightClass = flightClass;
		this.seat = seat;
	}


	public int getFlightId() {
		return flightId;
	}


	public String getFlightName() {
		return flightName;
	}


	public String getSource() {
		return source;
	}


	public String getDestination() {
		return destination;
	}


	public String getFlightClass() {
		return flightClass;
	}


	public int getSeat() {
		return seat;
	}


	@Override
	public String toString() {
		return "FlightDetailsBean [flightId=" + flightId + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", flightClass=" + flightClass + ", seat=" + seat + "]";
	}
	
	
	public void display() {
		System.out.println(getFlightId()+" "+getFlightName()+" " +getSource()+" "+ getDestination()+" "+getFlightClass()+ " "+ getSeat());
	}
	
}
