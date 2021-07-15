package com.xworkz.library_books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.library_books.bean.BooksBean;
import com.xworkz.library_books.bean.LibraryBean;

public class BookTester {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		LibraryBean lBean = applicationContext.getBean(LibraryBean.class);
		System.out.println(lBean.getName());
		
		BooksBean bBean = applicationContext.getBean(BooksBean.class);
		System.out.println("book name "+bBean.getName()+" and author name "+bBean.getAuthor());
	}

}
