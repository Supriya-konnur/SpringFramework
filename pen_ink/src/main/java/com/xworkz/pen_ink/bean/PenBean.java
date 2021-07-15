package com.xworkz.pen_ink.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PenBean implements Serializable {

	@Value(value = "3")
	private int id;
	@Value(value = "Reynolds")
	private String name;
	@Value(value = "5")
	private float price;
	@Autowired
	private InkBean ink;
	
	public PenBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public InkBean getInk() {
		return ink;
	}

	public void setInk(InkBean ink) {
		this.ink = ink;
	}

	@Override
	public String toString() {
		return "PenBean [id=" + id + ", name=" + name + ", price=" + price + ", ink=" + ink + "]";
	}
	
}
