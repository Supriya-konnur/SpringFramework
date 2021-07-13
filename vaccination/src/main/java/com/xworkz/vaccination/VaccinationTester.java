package com.xworkz.vaccination;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.vaccination.bean.VaccinationBean;

public class VaccinationTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
//		VaccinationBean bean = applicationContext.getBean(VaccinationBean.class);
//		System.out.println(bean);

		String string = (String) applicationContext.getBean("vaccine");
		System.out.println(string.toString());
	}

}
