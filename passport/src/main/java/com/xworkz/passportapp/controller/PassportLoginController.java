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
public class PassportLoginController {

	@Autowired
	private PassportService pService;
	
	public PassportLoginController() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	

	@PostMapping("/login.all")
	
	public ModelAndView createPassportDetails(String loginId,String password) {
		if(loginId!=null && password!=null) {
			 pService.validateAndVerifyDetails(loginId, password);
			return new ModelAndView("PassportLogin", "msg" ,"Thank you");
		}
		else {
			return new ModelAndView("PassportLogin", "msg" ,"Please Enter the Login Id and password ");
		}
	}
	
}
