package com.xworkz.groceryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.groceryapp.dao.GroceryDAO;
import com.xworkz.groceryapp.dto.GroceryDTO;
@Service
public class GroceryServiceImpl implements GroceryService{

	@Autowired
	private GroceryDAO gDAO;
	
	@Override
	public void validateAndSave(GroceryDTO groceryDTO) {
		if(groceryDTO!=null) {
			gDAO.save(groceryDTO);
		}
		
		
		
	}

}
