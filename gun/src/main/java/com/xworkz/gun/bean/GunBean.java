package com.xworkz.gun.bean;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class GunBean implements Serializable{

	private int id;
	private String name;
	private float range;
	private float recoilSpeed;
	private float price;
	private String [] otherGuns;
	
	
	public GunBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	
}
