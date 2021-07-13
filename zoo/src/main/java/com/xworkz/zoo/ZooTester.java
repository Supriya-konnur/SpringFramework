package com.xworkz.zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.zoo.bean.ZooBean;

public class ZooTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");

//		ZooBean bean = applicationContext.getBean(ZooBean.class);
//		System.out.println(bean);
		
		Integer integer= (Integer) applicationContext.getBean("int");
		System.out.println(integer.intValue());
	}

}
