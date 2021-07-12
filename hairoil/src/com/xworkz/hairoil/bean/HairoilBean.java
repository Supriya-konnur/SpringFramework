package com.xworkz.hairoil.bean;

import java.io.Serializable;

public class HairoilBean implements Serializable {

	private int id;
	private String name;
	private String company;
	private String netQty;
	private double price;

	public HairoilBean(int id, String name, String company, String netQty, double price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.netQty = netQty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getNetQty() {
		return netQty;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "HairoilBean [id=" + id + ", name=" + name + ", company=" + company + ", netQty=" + netQty + ", price="
				+ price + "]";
	}

	public void oildetail() {
		System.out.println(getId() + " " + getName() + " " + getNetQty() + " " + getPrice());
	}
}
