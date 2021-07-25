package com.xworkz.creditcard.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity

@NamedQueries(value = { 
		@NamedQuery(name = "getDetailsByName", query = "from CreditCardDTO dto where dto.name=:nm"),
		@NamedQuery(name = "getAllDetails", query = "from CreditCardDTO dto")
		
})

@Table(name="creditcard_details")
public class CreditCardDTO implements Serializable{

	@Id
	@Column(name="id")
	@GenericGenerator(name="auto" ,strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name="card_no")
	private String cardNO;
	
	@Column(name="card_name")
	private String cardName;
	
	@Column(name="bank")
	private String bank;
	
	@Column(name="expiry_date")
	private String expiryDate;
	
	@Column(name="color")
	private String color;
	
}
