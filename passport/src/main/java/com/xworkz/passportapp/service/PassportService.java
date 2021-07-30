package com.xworkz.passportapp.service;

import com.xworkz.passportapp.dto.PassportDTO;

public interface PassportService {

	public boolean validateAndPersistPassportDetails(PassportDTO passportDTO);

	public Boolean validateAndVerifyDetails(String loginId, String password);
}
