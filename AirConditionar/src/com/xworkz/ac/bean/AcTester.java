package com.xworkz.ac.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AcTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		AirConditionerBean bean = applicationContext.getBean(AirConditionerBean.class);
		System.out.println(bean);

	}

}
