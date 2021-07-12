package com.xworkz.mall;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mall.bean.MallBean;

public class MallTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		 MallBean bean = applicationContext.getBean(MallBean.class);
		 System.out.println(bean);
	}

}
