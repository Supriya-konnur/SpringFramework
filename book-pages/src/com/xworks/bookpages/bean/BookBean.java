package com.xworks.bookpages.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookBean {

	@Value("22")
	private int bookId;
	@Value("Classmate")
	private String name;
	@Value("Longsize")
	private String size;
	@Value("50")
	private double price;
	@Autowired
	private PageBean pages;
	
	public BookBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public PageBean getPages() {
		return pages;
	}

	public void setPages(PageBean pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
