package com.xworkz.portal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.portal.bean.OnlineLearningBean;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

		OnlineLearningBean bean = applicationContext.getBean(OnlineLearningBean.class);
		System.out.println(bean);

	}

}
