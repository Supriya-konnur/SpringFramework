package com.xworkz.passportapp.dao;

import com.xworkz.passportapp.dto.PassportDTO;

public interface PassportDAO {

	boolean persistPassportDetails(PassportDTO passportDTO);

}
