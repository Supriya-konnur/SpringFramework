package com.xworkz.videogame.service;

import com.xworkz.videogame.dto.VideoGameDTO;

public interface VideoGameService {

	public void validateAndSave(VideoGameDTO gameDTO);
}
