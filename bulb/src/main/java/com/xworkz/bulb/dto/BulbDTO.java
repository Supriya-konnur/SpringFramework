package com.xworkz.bulb.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity

@NamedQueries(value = { 
		@NamedQuery(name = "getAllDetails", query = "from BulbDTO dto"),
		@NamedQuery(name = "getDetailsByName", query = "from BulbDTO dto where dto.name=:na"),
		@NamedQuery(name = "updatePriceByName", query = "update BulbDTO dto set dto.price=:pri where dto.name=:nam"),
		@NamedQuery(name = "deleteDetailsByName", query = "delete from BulbDTO dto where dto.name = :name")
		
	})

@Table(name="bulb_detail")

@Getter
@Setter
@ToString
@NoArgsConstructor


public class BulbDTO implements Serializable{

	@Id
	@Column(name="id")
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	
}
