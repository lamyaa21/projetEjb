package org.GestionEmployee.Service;

import java.util.List;

import org.GestionEmployee.dao.ServiceRepository;
import org.GestionEmployee.model.Service;
import org.springframework.dao.DataAccessException;

public interface Servicesrv {
       
	public Iterable<Service> findAll();

	public static void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
		
	}

