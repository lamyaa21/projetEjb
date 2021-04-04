package org.GestionEmployee;

import java.util.List;

import org.GestionEmployee.dao.ServiceRepository;
import org.GestionEmployee.model.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class ProjetEjbApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(ProjetEjbApplication.class, args);

				ServiceRepository serviceRepository = ctx.getBean(ServiceRepository.class);
				serviceRepository.save(new Service( "Informatique", "Informatique"));
				serviceRepository.save(new Service("Comptabilite", "Comptabilite"));
				serviceRepository.save(new Service("RH", "RH"));
				serviceRepository.save(new Service("Personnel", "Personnel"));
				System.out.println("------------------------------");
				
				Page<Service> serv1 = serviceRepository.findAll(PageRequest.of(0, 5));
				serv1.forEach(s->System.out.println("Nom du Service est : " +
				s.getCode()));

				System.out.println();
				Page<Service> serv2 = serviceRepository.chercherService("T%",
			PageRequest.of(0, 5));
				serv2.forEach(s->System.out.println("Nom du Service est : " +
				s.getCode()));
				List<Service> list = serviceRepository.findByCode("Informatique");
				list.forEach(s->System.out.println(" ====> " + s.getCode()));
				System.out.println("------------------------------");
				}
	}


