package com.xworkz.bank_app.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Component
@Getter
@Setter
@ToString

public class AppsBean implements Serializable{

	@Value("23")
	private int id;
	@Value("BIO App")
	private String name;
	@Value("2.3")
	private float size;
	
	public AppsBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}
}
