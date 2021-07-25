<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.xworkz.videogame.dto.VideoGameDTO"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page
	import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
	<%@ page import="com.xworkz.videogame.service.VideoGameService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Video Games Details</title>
</head>
<body>

	<%   /* using scriplet tag*/   
	
	String nam = request.getParameter("name");
	String typ =request.getParameter("type");
	String year= request.getParameter("releaseYear");
	
	
	
	VideoGameDTO vDTO = new VideoGameDTO();
	vDTO.setName(nam);
	vDTO.setType(typ);
	vDTO.setReleaseYear(year);
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
	VideoGameService vService= applicationContext.getBean(VideoGameService.class);
	vService.validateAndSave(vDTO);
	
	out.println("Thank you for entering details of :"+nam);
	
	
	%>
</body>
</html>