package com.xworkz.passportapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.passportapp.dto.PassportDTO;
import com.xworkz.passportapp.service.PassportService;

@Controller
@RequestMapping("/")
public class PassportRegistrationController {

	
	public PassportRegistrationController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	@Autowired
	private PassportService service;
	
	@PostMapping("/registration.all")
	
	public ModelAndView createPassportDetails(@ModelAttribute PassportDTO dto) {
		if(dto != null && !dto.getLoginId().isEmpty() && !dto.getEmailId().isEmpty()) {
			service.validateAndPersistPassportDetails(dto);
			return new ModelAndView("PassportRegistration", "msg" ,"Thank you " +dto.getGivenName()+" for registering");
		}
		else {
			return new ModelAndView("PassportRegistration", "msg" ,"Please Enter the e-mail Id ");
		}
	}
}
