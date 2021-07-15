package com.xworkz.airport.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TerminalsBean {

	@Value(value = "2")
	private int id;
	@Value(value = "4")
	private int noOfTerminals;
	
	public TerminalsBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfTerminals() {
		return noOfTerminals;
	}

	public void setNoOfTerminals(int noOfTerminals) {
		this.noOfTerminals = noOfTerminals;
	}
	
}
