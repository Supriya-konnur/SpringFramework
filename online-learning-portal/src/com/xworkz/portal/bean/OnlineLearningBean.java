package com.xworkz.portal.bean;

import java.io.Serializable;

public class OnlineLearningBean implements Serializable{

	private int id;
	private String onlineLearningPortalName;
	private String studentName;
	private String studentEmail;
	private int onlineLearningPortalRating;
	
	
	public OnlineLearningBean(int id, String onlineLearningPortalName, String studentName, String studentEmail,
			int onlineLearningPortalRating) {
		super();
		this.id = id;
		this.onlineLearningPortalName = onlineLearningPortalName;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.onlineLearningPortalRating = onlineLearningPortalRating;
	}


	public int getId() {
		return id;
	}


	public String getOnlineLearningPortalName() {
		return onlineLearningPortalName;
	}


	public String getStudentName() {
		return studentName;
	}


	public String getStudentEmail() {
		return studentEmail;
	}


	public int getOnlineLearningPortalRating() {
		return onlineLearningPortalRating;
	}


	@Override
	public String toString() {
		return "OnlineLearningBean [id=" + id + ", onlineLearningPortalName=" + onlineLearningPortalName
				+ ", studentName=" + studentName + ", studentEmail=" + studentEmail + ", onlineLearningPortalRating="
				+ onlineLearningPortalRating + "]";
	}
	
	public void display() {
		System.out.println(getId()+" "+getOnlineLearningPortalName()+" "+getStudentName()+" "+getStudentEmail()+" "+getOnlineLearningPortalRating());
	}
	
}
