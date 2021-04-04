package org.GestionEmployee.dao;

import java.util.List;

import org.GestionEmployee.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ServiceRepository extends JpaRepository<Service, Long>{
	public List<Service> findByCode(String code);
	public Page<Service> findByCode(String code, Pageable pageable);
	@Query("select e from Service e where e.code like :x")
	public Page<Service> chercherService(@Param("x") String code,
	Pageable pageable);
	@Query("select e from Service e where e.libelle like :x")
	public List<Service> chercherService(@Param("x")String libelle);
	
	
	

}
