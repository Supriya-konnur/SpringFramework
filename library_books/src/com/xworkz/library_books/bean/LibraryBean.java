package com.xworkz.library_books.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class LibraryBean implements Serializable{

	@Value("8")
	private int id;
	@Value("Ranna Library")
	private String name;
	@Value("Mudhol")
	private String location;
	@Autowired
	private BooksBean book;
	
	public LibraryBean() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BooksBean getBook() {
		return book;
	}

	public void setBook(BooksBean book) {
		this.book = book;
	}
	
	
}
