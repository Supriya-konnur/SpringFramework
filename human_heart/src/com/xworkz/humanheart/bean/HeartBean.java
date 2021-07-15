package com.xworkz.humanheart.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class HeartBean implements Serializable{


	@Value("6")
	private int id;
	@Value("21")
	private int size;
	
	public HeartBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "HeartBean [id=" + id + ", size=" + size + "]";
	}
	
	
}
