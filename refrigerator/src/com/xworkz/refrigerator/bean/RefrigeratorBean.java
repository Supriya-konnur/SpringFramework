package com.xworkz.refrigerator.bean;

import java.io.Serializable;

public class RefrigeratorBean implements Serializable{

	private int refId;
	private String name;
	private String comapany;
	private String color;
	private double price;
	
	
	public RefrigeratorBean(int refId, String name, String comapany, String color, double price) {
		super();
		this.refId = refId;
		this.name = name;
		this.comapany = comapany;
		this.color = color;
		this.price = price;
	}


	public int getRefId() {
		return refId;
	}


	public String getName() {
		return name;
	}


	public String getComapany() {
		return comapany;
	}


	public String getColor() {
		return color;
	}


	public double getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "RefrigeratorBean [refId=" + refId + ", name=" + name + ", comapany=" + comapany + ", color=" + color
				+ ", price=" + price + "]";
	}
	
	public void display() {
		System.out.println(getRefId() +" " + getName()+" "+ getComapany()+" "+getColor()+" "+getPrice());
	}
	
}
