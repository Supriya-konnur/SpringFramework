package com.xworkz.creditcard.dao;

import java.util.List;

import com.xworkz.creditcard.dto.CreditCardDTO;

public interface CreditCardDAO {

	public void save(CreditCardDTO cardDTO);
	
	public CreditCardDTO getDetailsByName(String name);

	public List<CreditCardDTO> getAllDetails();
}
