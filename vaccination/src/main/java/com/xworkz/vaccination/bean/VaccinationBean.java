package com.xworkz.vaccination.bean;

import java.io.Serializable;

public class VaccinationBean implements Serializable{

	private int id;
	private String beneficiaryName;
	private int age;
	private String vaccineName;
	private String currentVaccinationStatus;
	private String dateOfDose;
	
	
	
	
	public VaccinationBean(int id, String beneficiaryName, int age, String vaccineName, String currentVaccinationStatus,
			String dateOfDose) {
		super();
		this.id = id;
		this.beneficiaryName = beneficiaryName;
		this.age = age;
		this.vaccineName = vaccineName;
		this.currentVaccinationStatus = currentVaccinationStatus;
		this.dateOfDose = dateOfDose;
	}
	
	
	public int getId() {
		return id;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public int getAge() {
		return age;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public String getCurrentVaccinationStatus() {
		return currentVaccinationStatus;
	}
	public String getDateOfDose() {
		return dateOfDose;
	}
	
	
	
}
