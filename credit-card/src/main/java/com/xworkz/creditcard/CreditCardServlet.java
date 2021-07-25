package com.xworkz.creditcard;

import java.io.IOException;
import java.util.List;

import javax.persistence.Column;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.creditcard.dto.CreditCardDTO;
import com.xworkz.creditcard.service.CreditCardService;

@WebServlet("/credit")
public class CreditCardServlet extends HttpServlet {

	public CreditCardServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cno = req.getParameter("cardNo");
		String cname = req.getParameter("cardName");
		String bank = req.getParameter("bank");
		String edate = req.getParameter("expirydate");
		String color = req.getParameter("color");
		
		CreditCardDTO cDTO = new CreditCardDTO();
		cDTO.setCardNO(cno);
		cDTO.setCardName(cname);
		cDTO.setBank(bank);
		cDTO.setExpiryDate(edate);
		cDTO.setColor(color);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		CreditCardService cService = applicationContext.getBean(CreditCardService.class);
		cService.save(cDTO);
		
		
//		CreditCardService cServic = applicationContext.getBean(CreditCardService.class);
//		cServic.getDetailsByName(cname);	
//		System.out.println(cServic);
//		
//		System.out.println();
//		List<CreditCardDTO> dtos = cServic.getAllDetails();
//		dtos.forEach(System.out::println);

	}
}