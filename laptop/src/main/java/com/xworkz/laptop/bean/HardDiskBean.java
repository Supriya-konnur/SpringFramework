package com.xworkz.laptop.bean;

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
public class HardDiskBean implements Serializable {

	@Value("32")
	private int hardDiskId;
	@Value("Samsung")
	private String hardDiskName;
	@Value("2")
	private int hardDiskCapacity;
}
