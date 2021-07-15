package com.xworkz.samsung.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TVBean {

	@Value("2")
	private int tvId;
	@Value("Samsung")
	private String name;
	@Value("42")
	private int  inches;
	@Value("4232")
	private int  moduleNo;
	@Autowired
	private RemoteBean remote;
	
	
	public TVBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}


	public int getTvId() {
		return tvId;
	}


	public void setTvId(int tvId) {
		this.tvId = tvId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getInches() {
		return inches;
	}


	public void setInches(int inches) {
		this.inches = inches;
	}


	public int getModuleNo() {
		return moduleNo;
	}


	public void setModuleNo(int moduleNo) {
		this.moduleNo = moduleNo;
	}


	public RemoteBean getRemote() {
		return remote;
	}


	public void setRemote(RemoteBean remote) {
		this.remote = remote;
	}
	
	
}
