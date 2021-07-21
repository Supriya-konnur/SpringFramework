package com.xworkz.soap.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.stereotype.Component;

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
		@NamedQuery(name = "getAllDetails", query = "from SoapDTO dto"),
		@NamedQuery(name = "getDetailsByName", query = "from SoapDTO dto where dto.name=:na"),
		@NamedQuery(name = "updatePriceByName", query = "update SoapDTO dto set dto.price=:pri where dto.name=:nam"),
		@NamedQuery(name = "deleteDetailsByName", query = "delete from SoapDTO dto where dto.name = :name")
		
	})


@Table(name="soap_detail")
@Component
public class SoapDTO implements Serializable{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private float price;
	@Column(name="quantity")
	private int quantity;
}


