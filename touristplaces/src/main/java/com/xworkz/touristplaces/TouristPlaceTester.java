package com.xworkz.touristplaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TouristPlaceTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		
		String string = (String) applicationContext.getBean("str");
		System.out.println(string.toString());

	}

}
