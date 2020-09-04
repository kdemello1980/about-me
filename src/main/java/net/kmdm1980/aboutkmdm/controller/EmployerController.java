package net.kmdm1980.aboutkmdm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kmdm1980.aboutkmdm.model.Employer;
import net.kmdm1980.aboutkmdm.service.EmployerService;

@RestController
public class EmployerController {

	@Autowired
	private EmployerService service;
	
	@GetMapping("/employers")
	public List<Employer> getAllEmployers() {
		return service.list();
	}
	
	
}
