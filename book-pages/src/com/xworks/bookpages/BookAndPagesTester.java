package com.xworks.bookpages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworks.bookpages.bean.BookBean;
import com.xworks.bookpages.bean.PageBean;

public class BookAndPagesTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		
		BookBean bean = applicationContext.getBean(BookBean.class);
		System.out.println(bean.getPages().getNoOfPages());
		
		PageBean pageBean = applicationContext.getBean(PageBean.class);
		System.out.println(pageBean.getType());

	}

}
