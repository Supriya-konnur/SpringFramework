package com.xworkz.hairoil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hairoil.bean.HairoilBean;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		
		HairoilBean bean = applicationContext.getBean(HairoilBean.class);
		System.out.println(bean);

	}

}
