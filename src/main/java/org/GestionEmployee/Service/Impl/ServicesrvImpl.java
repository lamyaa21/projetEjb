package org.GestionEmployee.Service.Impl;

import java.util.List;

import org.GestionEmployee.Service.Servicesrv;
import org.GestionEmployee.dao.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service("Servicesrv")
public class ServicesrvImpl implements Servicesrv{
	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public Iterable<org.GestionEmployee.model.Service> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
	}

	

	
	


	
	
	

}
