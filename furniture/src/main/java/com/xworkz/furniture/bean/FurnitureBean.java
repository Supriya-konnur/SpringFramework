package com.xworkz.furniture.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class FurnitureBean implements Serializable{

	@Value("2")
	private int fId;
	@Value("Table")
	private String name;
	@Value("4000.00")
	private double price;
	
	
	public FurnitureBean() {

		System.out.println(this.getClass().getSimpleName() +" created");
	}
	
	
	@PostConstruct
	public void initIds() {
		System.out.println("Initializing bean Object");
	}
	
	
	@PreDestroy
	public void destroyid() {
		System.out.println("All id are invalidated");
	}
}
