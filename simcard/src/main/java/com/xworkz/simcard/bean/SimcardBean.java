package com.xworkz.simcard.bean;

import java.io.Serializable;

public class SimcardBean implements Serializable{

	private int id;
	private String name;
	private String headQuarters;
	private int revenue;
	
	public SimcardBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
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

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadQuarters() {
		return headQuarters;
	}

	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	
}
