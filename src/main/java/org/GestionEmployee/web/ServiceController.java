package org.GestionEmployee.web;

import java.util.List;

import org.GestionEmployee.Service.Servicesrv;
import org.GestionEmployee.dao.ServiceRepository;
import org.GestionEmployee.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/Service")
public class ServiceController {

	@Autowired
	private ServiceRepository serviceRepository;
	
	@RequestMapping(value="/presentation",method=RequestMethod.GET)
	public String presentation(Model model)  {
		List<Service> servs = serviceRepository.findAll();
		model.addAttribute("Services", servs);
		model.addAttribute("service",new Service());
       
		return "presentation";
		
		}
	
	@RequestMapping(value="/ajouterservice", method=RequestMethod.POST)
	public String ajouterservice(Service sr) throws Exception {
	serviceRepository.save(sr);
	return "redirect:presentation";
	}
	
	@RequestMapping(value = "deleteservice/{id}", method = RequestMethod.GET)
	public String deleteservice(Service id) throws Exception{
		serviceRepository.delete(id);
		return "redirect:presentation";
	}
	
	
}
