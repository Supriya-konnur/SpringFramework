package com.xworkz.planet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.planet.bean.PlanetBean;

public class PlanetTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		PlanetBean bean = applicationContext.getBean(PlanetBean.class);
		System.out.println(bean);

	}

}
