package com.xworkz.washingmachine.bean;

import java.io.Serializable;

public class WashingMachineBean implements Serializable {

	 public int wmId;
	 public String name;
	 public String type;
	 public String color;
	 public double price;
	public int getWmId() {
		return wmId;
	}
	public void setWmId(int wmId) {
		this.wmId = wmId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "WashingMachineBean [wmId=" + wmId + ", name=" + name + ", type=" + type + ", color=" + color
				+ ", price=" + price + "]";
	}
	 
	public void displayWM() {
		System.out.println(getWmId()+ " " + getName() + " " +getType() + getColor()+ " " + getPrice());
	}
}
