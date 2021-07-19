package com.xworkz.laptop.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

@Component
public class LaptopBean implements Serializable{

	@Value("3")
	private int id;
	@Value("Lenovo")
	private String name;
	@Value("G20")
	private String version;
	@Value("30000")
	private float price;
	@Autowired
	private HardDiskBean hDisk;
}
