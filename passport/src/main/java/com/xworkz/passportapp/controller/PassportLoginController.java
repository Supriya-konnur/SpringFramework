package com.xworkz.passportapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.passportapp.dto.PassportDTO;

@Controller
@RequestMapping("/")
public class PassportLoginController {

	public PassportLoginController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	

	@PostMapping("/registration.all")
	
	public ModelAndView createPassportDetails(@ModelAttribute PassportDTO dto) {
		if(dto != null && !dto.getLoginId().isEmpty() && !dto.getPassword().isEmpty()) {
			return new ModelAndView("PassportLogin", "msg" ,"Thank you");
		}
		else {
			return new ModelAndView("PassportLogin", "msg" ,"Please Enter the Login Id and password ");
		}
	}
	
}
