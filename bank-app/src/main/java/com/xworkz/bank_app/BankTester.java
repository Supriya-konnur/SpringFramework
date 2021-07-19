package com.xworkz.bank_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bank_app.bean.BankBean;

public class BankTester {

	public static void main(String[] args) {

		ApplicationContext  applicationContex = new ClassPathXmlApplicationContext("resources/context.xml");
		System.out.println(applicationContex.getBean(BankBean.class));

	}

}
