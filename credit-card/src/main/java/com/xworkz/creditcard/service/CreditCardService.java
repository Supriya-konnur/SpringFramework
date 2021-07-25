package com.xworkz.creditcard.service;

import java.util.List;

import com.xworkz.creditcard.dto.CreditCardDTO;

public interface CreditCardService {
	
	public void save(CreditCardDTO cardDTO);

	public CreditCardDTO getDetailsByName(String name);

	public List<CreditCardDTO> getAllDetails();
}
