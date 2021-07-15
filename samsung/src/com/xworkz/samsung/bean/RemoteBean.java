package com.xworkz.samsung.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RemoteBean {

	@Value("56")
	private int remoteId;
	@Value("black")
	private String color;
	@Value("5")
	private int range;
	@Value("25")
	private int noOfButtons;
	
	
	public RemoteBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	
	public int getRemoteId() {
		return remoteId;
	}
	public void setRemoteId(int remoteId) {
		this.remoteId = remoteId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getNoOfButtons() {
		return noOfButtons;
	}
	public void setNoOfButtons(int noOfButtons) {
		this.noOfButtons = noOfButtons;
	}
	
	
	
}
