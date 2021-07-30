package com.xworkz.passportapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity

@NamedQueries(value = {
		
		@NamedQuery(name = "verifyDetails", query = "SELECT dto from PassportDTO dto where loginId=:lid AND confirm_password=:cpas")
		
})

@Table(name="passport_details")

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PassportDTO implements Serializable{


	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="office")
	private String office;
	@Column(name="select_location")
	private String selectLocation;
	@Column(name="given_name")
	private String givenName;
	@Column(name="sur_name")
	private String surName;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="email_id")
	private String emailId;
	@Column(name="login_id")
	private String loginId;
	@Column(name="password")
	private String password;
	@Column(name="confirm_password")
	private String confirmPassword;
}
