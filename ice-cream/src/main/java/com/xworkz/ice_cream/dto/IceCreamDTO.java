package com.xworkz.ice_cream.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity

@NamedQueries(value = { 
		@NamedQuery(name = "getAllDetails", query = "from IceCreamDTO dto"),
		@NamedQuery(name = "getDetailsByName", query = "from IceCreamDTO dto where dto.name=:nm"),
		@NamedQuery(name = "updatePriceByName", query = "update IceCreamDTO dto set dto.price=:pr where dto.name=:nm"),
		@NamedQuery(name = "deleteDetailsByName", query = "delete from IceCreamDTO dto where dto.name = :nm")
		
	})


@Table(name="icecream_detail")
@Getter
@Setter
@ToString
@NoArgsConstructor


public class IceCreamDTO implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="flavour")
	private String flavour;
	@Column(name="color")
	private String color;
	@Column(name="price")
	private double price;
	
	
}
