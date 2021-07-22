package com.xworkz.ice_cream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ice_cream.dao.IceCreamDAO;
import com.xworkz.ice_cream.dto.IceCreamDTO;
@Component
public class IceCreamServiceImpl implements IceCreamService{

	@Autowired
	private IceCreamDAO cDAO;
	
	@Override
	public void validateAndSave(IceCreamDTO creamDTO) {
		if(creamDTO!=null) {
			cDAO.save(creamDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
			
	}

	@Override
	public List<IceCreamDTO> getAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IceCreamDTO getDetailsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePriceByName(String name, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDetailsByName(String name) {
		// TODO Auto-generated method stub
		
	}

	
}
