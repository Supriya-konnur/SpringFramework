package com.xworkz.airline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.airline.bean.FlightDetailsBean;


public class FlightTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

		FlightDetailsBean bean = applicationContext.getBean(FlightDetailsBean.class);
		System.out.println(bean);

	}

}
