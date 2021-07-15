package com.xworkz.pen_ink;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.pen_ink.bean.InkBean;
import com.xworkz.pen_ink.bean.PenBean;

public class PenInkTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		PenBean pBean = applicationContext.getBean(PenBean.class);
		System.out.println(pBean.getPrice());
		
		InkBean iBean = applicationContext.getBean(InkBean.class);
		System.out.println(iBean.getColor());

	}

}
