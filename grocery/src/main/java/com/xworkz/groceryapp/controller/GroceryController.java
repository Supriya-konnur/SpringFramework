package com.xworkz.groceryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.groceryapp.dto.GroceryDTO;
import com.xworkz.groceryapp.service.GroceryService;

@Controller
@RequestMapping("/")
public class GroceryController {

	public GroceryController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private GroceryService groceryService;
	
	@PostMapping("/grocery.all")
	
//	@RequestMapping(value="/grocery.all" ,method=RequestMethod.POST )
	
	public ModelAndView saveGroceryDetails(@ModelAttribute GroceryDTO dto) {
		if(!dto.getGroceryName().isEmpty() && dto.getGroceryName() != null) {
			
			groceryService.validateAndSave(dto);
			
			return new ModelAndView("success", "msg", "Thank you for purchasing!!!" + dto.getGroceryName());	
		}
		
		return new ModelAndView("grocery", "msg", "Please Try agian");
	}
}
