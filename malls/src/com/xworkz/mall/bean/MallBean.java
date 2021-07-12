package com.xworkz.mall.bean;

import java.io.Serializable;

public class MallBean implements Serializable{

	private int mallId;
	private String name;
	private String location;
	private int rating;
	
	public MallBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
	}

	public MallBean(int mallId, String name, String location, int rating) {
		super();
		this.mallId = mallId;
		this.name = name;
		this.location = location;
		this.rating = rating;
	}

	public int getMallId() {
		return mallId;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "MallBean [mallId=" + mallId + ", name=" + name + ", location=" + location + ", rating=" + rating + "]";
	}
	
	public void display() {
		System.out.println(getMallId() + " " + getName()+ " "+ getLocation() + " " + getRating());
	}
	
	
}
