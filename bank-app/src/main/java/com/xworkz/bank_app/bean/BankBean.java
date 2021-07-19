package com.xworkz.bank_app.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;
@ToString

@Component

public class BankBean implements Serializable{

	private int id;
	private String name;
	private String headQuarters;
	private int noOfBranches;
	private AppsBean app;
	
	public BankBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}

	@Autowired
	public BankBean(@Value(value = "34") int id, @Value(value = "BOI") String name, @Value(value = "Bangalore") String headQuarters, @Value(value = "20") int noOfBranches, AppsBean app) {
		super();
		this.id = id;
		this.name = name;
		this.headQuarters = headQuarters;
		this.noOfBranches = noOfBranches;
		this.app = app;
	}
	
	
	
}
