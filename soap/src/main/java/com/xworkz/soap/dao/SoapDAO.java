package com.xworkz.soap.dao;

import java.util.List;

import com.xworkz.soap.dto.SoapDTO;

public interface SoapDAO {

	public void save(SoapDTO sDTO);

	public List<SoapDTO> getAllDetails();

	public SoapDTO getDetailsByName(String name);

	public void updatePriceByName(String name,Float price);

	public void deleteDetailsByName(String name);
}
