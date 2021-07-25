package com.xworkz.bulb.service;

import java.util.List;

import com.xworkz.bulb.dto.BulbDTO;

public interface BulbService {

	public void validateAndSave(BulbDTO bulbDTO);

	public List<BulbDTO> getAllDetails();

	public BulbDTO getDetailsByName(String name);

	public void validateAndUpdatePriceByName(String name,double price);

	public void validateAndDeleteDetailsByName(String name);

}
