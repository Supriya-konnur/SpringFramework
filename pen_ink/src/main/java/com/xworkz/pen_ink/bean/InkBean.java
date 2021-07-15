package com.xworkz.pen_ink.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class InkBean implements Serializable{

	@Value(value = "4")
	private int id;
	@Value(value = "Blue")
	private String color;
	
	public InkBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "InkBean [id=" + id + ", color=" + color + "]";
	}
}
