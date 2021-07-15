package com.xworks.bookpages.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PageBean {

	@Value("33")
	private int pageId;
	@Value("Unrold")
	private String type;
	@Value("200")
	private int noOfPages;
	
	public PageBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	
}
