package com.xworkz.airport.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class AirportBean implements Serializable{

	@Value(value = "2")
	private int id;
	@Value(value = "Bangalore International Airport")
	private String name;
	@Value(value = "International")
	private String type;
	@Autowired
	private TerminalsBean terminal;
	
	public AirportBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public TerminalsBean getTerminal() {
		return terminal;
	}
	
	
}
