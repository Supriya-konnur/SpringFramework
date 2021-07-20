package com.xworkz.soap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soap.dao.SoapDAO;
import com.xworkz.soap.dto.SoapDTO;
@Component
public class SoapServiceImpl implements SoapService{

	@Autowired
	public SoapDAO sDAO;
	
	
	@Override
	public void validateAndSave(SoapDTO sDTO) {
		if(sDTO!=null) {
			sDAO.save(sDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
		
	}

	@Override
	public List<SoapDTO> fetchAllDetails() {
		return sDAO.getAllDetails();
	}

	@Override
	public SoapDTO getDetailsByName(String name) {
		if(name!=null) {
			return sDAO.getDetailsByName(name);
			}
			else {
				System.out.println("name cant be null");
			}
		return null;
	}

	@Override
	public void updatePriceByName(String name, Float price) {

		if(name!=null) {
			sDAO.updatePriceByName(name,price);
			}
			else {
				System.out.println("name cant be null");
			}
	}

	@Override
	public void validateAndDeleteByName(String name) {
		if(name!=null) {
			sDAO.deleteDetailsByName(name);
			}
			else {
				System.out.println("name cant be null");
			}
	}

}
