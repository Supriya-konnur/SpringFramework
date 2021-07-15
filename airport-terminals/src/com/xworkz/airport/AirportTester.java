package com.xworkz.airport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.airport.bean.AirportBean;
import com.xworkz.airport.bean.TerminalsBean;

public class AirportTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		AirportBean aBean = applicationContext.getBean(AirportBean.class);
		System.out.println(aBean);
		
		TerminalsBean tBean = applicationContext.getBean(TerminalsBean.class);
		System.out.println(tBean);


	}

}
