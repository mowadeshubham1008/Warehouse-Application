package in.nit.shubham.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import in.nit.shubham.repo.ShipmentTypeRepository;
import in.nit.shubham.service.IShipmentTypeService;

public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private ShipmentTypeRepository repo;

}
