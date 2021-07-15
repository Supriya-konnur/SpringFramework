package com.xworkz.samsung;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.samsung.bean.RemoteBean;
import com.xworkz.samsung.bean.TVBean;

public class SamsungTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		
		TVBean  bean = applicationContext.getBean(TVBean.class);
		RemoteBean remoteBean = bean.getRemote();
		System.out.println(remoteBean);
		System.out.println(remoteBean.getNoOfButtons());

	}

}
