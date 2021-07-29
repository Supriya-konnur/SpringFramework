package com.xworkz.passportapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.passportapp.dao.PassportDAO;
import com.xworkz.passportapp.dto.PassportDTO;

@Service
public class PassportServiceImpl implements PassportService{

	@Autowired
	private PassportDAO pDAO;
	
	public PassportServiceImpl() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@Override
	public boolean validateAndPersistPassportDetails(PassportDTO passportDTO) {
		if(passportDTO!=null) {
			return pDAO.persistPassportDetails(passportDTO);
		}
		return false;
	}
	
	
}
