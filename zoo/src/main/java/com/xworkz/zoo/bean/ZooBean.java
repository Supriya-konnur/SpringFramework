package com.xworkz.zoo.bean;

import java.io.Serializable;

public class ZooBean implements Serializable {

	private int id;
	private String name;
	private String location;
	private int noOfAnimals;

	public ZooBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
	}

	
	
	public ZooBean(int id) {
		super();
		this.id = id;
	}



	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

}
