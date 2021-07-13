package com.xworkz.stationary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.stationary.bean.StationaryBean;

public class StationaryTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		
		StationaryBean bean =applicationContext.getBean(StationaryBean.class);
		System.out.println(bean);
		System.out.println("owner name is "+bean.getOwnerName()+ "  and location is "+ bean.getLocation());
		
		

	}

}
