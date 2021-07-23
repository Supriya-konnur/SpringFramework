package com.xworkz.videogame;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.videogame.dto.VideoGameDTO;
import com.xworkz.videogame.service.VideoGameService;

@WebServlet("/vg")
public class VideoGameServlet extends HttpServlet {

	public VideoGameServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nam = req.getParameter("name");
		String typ = req.getParameter("type");
		String year = req.getParameter("releaseYear");
		
		
		
		VideoGameDTO vDTO = new VideoGameDTO();
		vDTO.setName(nam);
		vDTO.setType(typ);
		vDTO.setReleaseYear(year);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		VideoGameService vService= applicationContext.getBean(VideoGameService.class);
		vService.validateAndSave(vDTO);
		
		PrintWriter pw= resp.getWriter();
		resp.setContentType("text/html");
		pw.println("Thank you for entering details of :"+nam);
		
	}
}
