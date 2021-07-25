package com.xworkz.bulb.dao;

import java.util.List;

import com.xworkz.bulb.dto.BulbDTO;

public interface BulbDAO {

	public void save(BulbDTO bulbDTO);

	public List<BulbDTO> getAllDetails();

	public BulbDTO getDetailsByName(String name);

	public void updatePriceByName(String name,double price);

	public void deleteDetailsByName(String name);

}
