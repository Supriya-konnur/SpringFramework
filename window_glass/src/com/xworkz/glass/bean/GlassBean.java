package com.xworkz.glass.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class GlassBean implements Serializable{

	@Value(value = "3")
	private int id;
	@Value(value = "SaintGoblin")
	private String name;
	@Value(value = "Blue")
	private String color;
	
	
	public GlassBean() {
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
}
