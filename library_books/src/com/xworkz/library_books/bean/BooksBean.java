package com.xworkz.library_books.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class BooksBean implements Serializable{

	@Value("8")
	private int id;
	@Value("Shantipuran")
	private String name;
	@Value("Ranna")
	private String author;
	
	public BooksBean() {
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
