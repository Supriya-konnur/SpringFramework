package com.xworkz.glass.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class WindowBean implements Serializable{

	
	@Value(value = "2")
	private int id;
	@Value(value = "GreenPly")
	private String name;
	@Value(value = "wood")
	private String type;
	@Autowired
	private GlassBean glass;
	
	public WindowBean() {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GlassBean getGlass() {
		return glass;
	}

	public void setGlass(GlassBean glass) {
		this.glass = glass;
	}
	
}
