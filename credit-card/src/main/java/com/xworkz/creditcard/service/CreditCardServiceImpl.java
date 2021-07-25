package com.xworkz.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.creditcard.dao.CreditCardDAO;
import com.xworkz.creditcard.dto.CreditCardDTO;
@Component
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	private CreditCardDAO cDAO;
	
	@Override
	public void save(CreditCardDTO cardDTO) {
	
		if(cardDTO!=null) {
			cDAO.save(cardDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
	}

	@Override
	public CreditCardDTO getDetailsByName(String name) {
		// TODO Auto-generated method stub
		return cDAO.getDetailsByName(name);
	}

	@Override
	public List<CreditCardDTO> getAllDetails() {
		// TODO Auto-generated method stub
		return cDAO.getAllDetails();
	}

}
