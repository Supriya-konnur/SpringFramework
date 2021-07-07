package com.xworkz.planet.bean;

import java.io.Serializable;

public class PlanetBean implements Serializable {

	private int planetId;
	private String name;
	private long revolvingSpeed;
	private boolean waterAvailable;
	
	public PlanetBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
	}

	public int getPlanetId() {
		return planetId;
	}

	public void setPlanetId(int planetId) {
		this.planetId = planetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRevolvingSpeed() {
		return revolvingSpeed;
	}

	public void setRevolvingSpeed(long revolvingSpeed) {
		this.revolvingSpeed = revolvingSpeed;
	}

	public boolean isWaterAvailable() {
		return waterAvailable;
	}

	public void setWaterAvailable(boolean waterAvailable) {
		this.waterAvailable = waterAvailable;
	}
	
	public void displanet() {
		System.out.println(getName() + " "+ getPlanetId() + " "+ getRevolvingSpeed()+ " " + isWaterAvailable());
	}

	@Override
	public String toString() {
		return "PlanetBean [planetId=" + planetId + ", name=" + name + ", revolvingSpeed=" + revolvingSpeed
				+ ", waterAvailable=" + waterAvailable + "]";
	}
	
	
}
