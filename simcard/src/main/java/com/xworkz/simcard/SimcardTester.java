package com.xworkz.simcard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.simcard.bean.SimcardBean;

public class SimcardTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		SimcardBean bean = applicationContext.getBean(SimcardBean.class);

		System.out.println(bean);

		SimcardBean bean1 = applicationContext.getBean(SimcardBean.class);

		System.out.println(bean1);

	}

}
