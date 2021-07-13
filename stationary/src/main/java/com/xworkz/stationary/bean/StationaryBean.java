package com.xworkz.stationary.bean;

import java.io.Serializable;

public class StationaryBean implements Serializable{

	private int id;
	private String stationaryname;
	private String location;
	private String ownerName;
	
	public StationaryBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStationaryname() {
		return stationaryname;
	}

	public void setStationaryname(String stationaryname) {
		this.stationaryname = stationaryname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
}
