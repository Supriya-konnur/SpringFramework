package com.xworkz.bulb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bulb.dao.BulbDAO;
import com.xworkz.bulb.dto.BulbDTO;
@Component
public class BulbServiceImpl implements BulbService{

	@Autowired
	public BulbDAO bDAO;
	
	
	@Override
	public void validateAndSave(BulbDTO bulbDTO) {
		if(bulbDTO!=null) {
			bDAO.save(bulbDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
	}

	@Override
	public List<BulbDTO> getAllDetails() {
		return bDAO.getAllDetails();
	}

	@Override
	public BulbDTO getDetailsByName(String name) {
		if(name!=null) {
			return bDAO.getDetailsByName(name);
			}
			else {
				System.out.println("name cant be null");
			}
			
		return null;
	}

	@Override
	public void validateAndUpdatePriceByName(String name, double price) {
		if(name!=null) {
			bDAO.updatePriceByName(name,price);
			}
			else {
				System.out.println("name cant be null");
			}
	}

	@Override
	public void validateAndDeleteDetailsByName(String name) {
		if(name!=null) {
			bDAO.deleteDetailsByName(name);
			}
			else {
				System.out.println("name cant be null");
			}
	}

	
}
