package com.xworkz.ac.bean;

import java.io.Serializable;

public class AirConditionerBean implements Serializable{

	public int acId;
	public String name;
	public String color;
	public String companyName;
	public double price;
	
	public AirConditionerBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
	}

	public int getAcId() {
		return acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AirConditionerBean [acId=" + acId + ", name=" + name + ", color=" + color + ", companyName="
				+ companyName + ", price=" + price + "]";
	}
	
	public void displayACDetail() {
		System.out.println(getAcId() +" "+getName() + " " + getColor() + " " + getCompanyName() + " " + getPrice());
	}
}
