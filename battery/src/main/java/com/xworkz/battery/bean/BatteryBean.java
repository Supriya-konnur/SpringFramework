package com.xworkz.battery.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter

@ToString
public class BatteryBean implements Serializable{

	private int id;
	private String name;
	private int power;
	private int price;
	
	public BatteryBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
}
