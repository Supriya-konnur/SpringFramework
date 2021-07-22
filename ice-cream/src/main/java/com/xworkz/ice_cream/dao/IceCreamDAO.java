package com.xworkz.ice_cream.dao;

import java.util.List;

import com.xworkz.ice_cream.dto.IceCreamDTO;

public interface IceCreamDAO {


	public void save(IceCreamDTO creamDTO);

	public List<IceCreamDTO> getAllDetails();

	public IceCreamDTO getDetailsByName(String name);

	public void updatePriceByName(String name,double price);

	public void deleteDetailsByName(String name);

}
