package com.xworkz.washingmachine.bean;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WMTester {

	public static void main(String[] args) {

		ApplicationContext applicationException = new ClassPathXmlApplicationContext("context.xml");
		WashingMachineBean bean = applicationException.getBean(WashingMachineBean.class);
		System.out.println(bean);
	}

}
