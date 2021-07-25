package com.xworkz.bag.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.bag.dto.BagDTO;

@Component
@RequestMapping("/")
public class BagController {

	@RequestMapping(value="/bg",method=RequestMethod.POST)
	public String saveMovieDetails(@ModelAttribute BagDTO bDTO) {
		System.out.println("add bag details inside controller");
		if(!bDTO.getBrand().isEmpty() && bDTO.getColor()!=null && bDTO.getPrice()!=null) {
			System.out.println("Success...");
			return "/Success.jsp";	
		}
		else {
			System.out.println("failed...");
			
		}
		return "/bag.jsp";
		
	}
}
