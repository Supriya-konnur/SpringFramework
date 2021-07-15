package com.xworkz.humanheart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.humanheart.bean.HeartBean;
import com.xworkz.humanheart.bean.HumanBean;

public class HumanHeatTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		HumanBean hBean = applicationContext.getBean(HumanBean.class);
		System.out.println(hBean);
		System.out.println(hBean.getHeart().getSize());
		
		HeartBean heBean = applicationContext.getBean(HeartBean.class);
		System.out.println(heBean);
		
	}

}
