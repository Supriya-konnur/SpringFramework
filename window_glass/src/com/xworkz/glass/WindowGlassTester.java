package com.xworkz.glass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.glass.bean.GlassBean;
import com.xworkz.glass.bean.WindowBean;

public class WindowGlassTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		WindowBean wBean = applicationContext.getBean(WindowBean.class);
		System.out.println(wBean.getName());
		
		GlassBean gBean = applicationContext.getBean(GlassBean.class);
		System.out.println(gBean);

	}

}
