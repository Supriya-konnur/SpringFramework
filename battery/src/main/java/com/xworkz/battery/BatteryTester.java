package com.xworkz.battery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.battery.bean.BatteryBean;

public class BatteryTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		BatteryBean bean = applicationContext.getBean(BatteryBean.class);
		System.out.println(bean.getName());

	}

}
