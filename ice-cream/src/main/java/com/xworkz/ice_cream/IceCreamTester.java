package com.xworkz.ice_cream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.ice_cream.dto.IceCreamDTO;
import com.xworkz.ice_cream.service.IceCreamService;

public class IceCreamTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		
		IceCreamDTO dto = new IceCreamDTO();
		dto.setName("American dry nuts");
		dto.setColor("chocolate");
		dto.setFlavour("chacolate");
		dto.setPrice(150.00);
		
		IceCreamService service =applicationContext.getBean(IceCreamService.class);
		service.validateAndSave(dto);
	}

}
