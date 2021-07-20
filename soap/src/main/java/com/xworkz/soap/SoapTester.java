package com.xworkz.soap;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.soap.dto.SoapDTO;
import com.xworkz.soap.service.SoapService;
import com.xworkz.soap.service.SoapServiceImpl;

public class SoapTester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/context.xml");

		SoapDTO soapDTO =new SoapDTO();
//		soapDTO.setId(2);
		soapDTO.setName("Dove");
		soapDTO.setPrice(80);
		soapDTO.setQuantity(2);
		
		SoapService service = applicationContext.getBean(SoapService.class);
//		service.validateAndSave(soapDTO);
		
		List<SoapDTO> cDTOs = service.fetchAllDetails();
		cDTOs.forEach(System.out::println);
		
		SoapDTO dto = service.getDetailsByName("Santoor");
		System.out.println(dto);
		
		service.updatePriceByName("Detol", (float) 22.0);
		
		service.validateAndDeleteByName("Dove");
	}

}
