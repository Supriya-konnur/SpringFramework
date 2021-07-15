package com.xworkz.humanheart.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class HumanBean implements Serializable{

	@Value("4")
	private int id;
	@Value("Rohit")
	private String name;
	@Value("male")
	private String gender;
	@Value("20")
	private int age;
	@Autowired
	private HeartBean heart;
	
	public HumanBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public HeartBean getHeart() {
		return heart;
	}
	public void setHeart(HeartBean heart) {
		this.heart = heart;
	}
	@Override
	public String toString() {
		return "HumanBean [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", heart=" + heart
				+ "]";
	}
	
	
}
