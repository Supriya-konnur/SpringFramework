package com.xworkz.videogame.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name="videogame_details")

public class VideoGameDTO implements Serializable{

	@Id
	@Column(name="id")
	@GenericGenerator(name="auto" ,strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="type")
	private String type;
	@Column(name="release_year")
	private String releaseYear;
}
