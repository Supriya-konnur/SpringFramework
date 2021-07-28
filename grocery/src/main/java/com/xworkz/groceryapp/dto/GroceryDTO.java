package com.xworkz.groceryapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="grocery_details")
public class GroceryDTO implements Serializable{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String groceryName;
	@Column(name="quantity")
	private String groceryQuantity;
	@Column(name="price")
	private String groceryPrice;
	@Column(name="mfgdate")
	private String mfgDate;
}
