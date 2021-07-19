package com.xworkz.country_state;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.country_state.bean.CountryBean;

public class CountryStateTester {

	public static void main(String[] args) {

		ApplicationContext  applicationContex = new ClassPathXmlApplicationContext("resources/context.xml");
		System.out.println(applicationContex.getBean(CountryBean.class));

	}

}
