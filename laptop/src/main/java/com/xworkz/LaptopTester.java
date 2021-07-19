package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.bean.LaptopBean;

public class LaptopTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("resources/context.xml");
		System.out.println(applicationContext.getBean(LaptopBean.class));
	}

}
