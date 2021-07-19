package com.xworkz.furniture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.furniture.bean.FurnitureBean;

public class FurnitureTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		System.out.println(applicationContext.getBean(FurnitureBean.class));
		
	}

}
