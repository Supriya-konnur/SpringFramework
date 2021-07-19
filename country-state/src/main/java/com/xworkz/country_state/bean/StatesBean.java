package com.xworkz.country_state.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Component

public class StatesBean implements Serializable{
	@Value(value = "5")
	private int id;
	@Value(value = "Karnataka")
	private String name;
	@Value(value = "Bangalore")
	private String capital;
	
	public StatesBean() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}
}
