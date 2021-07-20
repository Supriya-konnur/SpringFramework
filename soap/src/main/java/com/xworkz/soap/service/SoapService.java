package com.xworkz.soap.service;

import java.util.List;

import com.xworkz.soap.dto.SoapDTO;

public interface SoapService {

	public void validateAndSave(SoapDTO sDTO);

	public List<SoapDTO> fetchAllDetails();

	public SoapDTO getDetailsByName(String name);

	public void updatePriceByName(String name,Float price);

	public void validateAndDeleteByName(String name);

}
