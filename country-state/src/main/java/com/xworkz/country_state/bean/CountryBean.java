package com.xworkz.country_state.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Component
@ToString
@Getter
@Setter
public class CountryBean implements Serializable{
	
	@Value(value = "1")
	private int id;
	@Value(value = "India")
	private String name;
	@Value(value = "New Delhi")
	private String capital;
	
	private StatesBean state;
	
	public CountryBean() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	public StatesBean getState() {
		return state;
	}
	@Autowired
	public void setState(StatesBean state) {
		this.state = state;
	}
	
	
}
