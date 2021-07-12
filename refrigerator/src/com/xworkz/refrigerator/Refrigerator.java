package com.xworkz.refrigerator;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.refrigerator.bean.RefrigeratorBean;

public class Refrigerator {

	public static void main(String[] args) {
		
		ApplicationContext appletContext = new ClassPathXmlApplicationContext("context.xml");
		
		RefrigeratorBean bean = appletContext.getBean(RefrigeratorBean.class);
		 System.out.println(bean);
	}
}
