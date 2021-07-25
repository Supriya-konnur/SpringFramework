package com.xworkz.bulb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bulb.dto.BulbDTO;
import com.xworkz.bulb.service.BulbService;

public class BulbTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");
		
		BulbDTO bulbDTO = new BulbDTO();
		bulbDTO.setName("Philips");
		bulbDTO.setPrice(100.00);
		bulbDTO.setQuantity(1);
		
		BulbService service = applicationContext.getBean(BulbService.class);
		
		service.validateAndSave(bulbDTO);
	}

}
