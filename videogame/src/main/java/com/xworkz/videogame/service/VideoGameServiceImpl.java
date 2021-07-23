package com.xworkz.videogame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.videogame.dao.VideoGameDAO;
import com.xworkz.videogame.dto.VideoGameDTO;
@Component
public class VideoGameServiceImpl implements VideoGameService{

	@Autowired
	private VideoGameDAO vDAO;
	
	@Override
	public void validateAndSave(VideoGameDTO gameDTO) {
		
		if(gameDTO!=null) {
			vDAO.save(gameDTO);
		}
		else {
			System.out.println("DTO cant be null");
		}
		
	}

}
