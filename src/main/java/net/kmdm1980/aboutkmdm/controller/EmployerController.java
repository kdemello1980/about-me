package net.kmdm1980.aboutkmdm.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.kmdm1980.aboutkmdm.exception.EmployerNotFoundException;
import net.kmdm1980.aboutkmdm.model.Employer;
import net.kmdm1980.aboutkmdm.model.Title;
import net.kmdm1980.aboutkmdm.repository.EmployerRepository;

@CrossOrigin
@RestController
public class EmployerController {

	@Autowired
	private EmployerRepository service;
//	private EmployerService service;
	
	@GetMapping("/employers")
	public List<Employer> getAllEmployers() {
		return service.findAll();
	}
	
	@GetMapping("/employers/{id}")
	public Employer getOne(@PathVariable Long id) {
		return service.findById(id)
				.orElseThrow(() -> new EmployerNotFoundException(id));
	}
	
	
	@PostMapping("/employers")
	Employer newEmployer(@RequestBody Employer emp) {
		return service.save(emp);
	}
	
	@PutMapping("/employers/{id}")
	Employer updateEmployer(@RequestBody Employer newEmployer, @PathVariable Long id) {
		return service.findById(id)
				.map(employer -> {
					employer.setName(newEmployer.getName());
					employer.setHireYear(newEmployer.getHireYear());
					return service.save(employer);
				}).orElseGet(() -> {
					newEmployer.setEmployerId(id);
					return service.save(newEmployer);
				});
	}
	
	@DeleteMapping("/employers/{id}")
	public void deleteEmployer(@PathVariable Long id) {
		service.deleteById(id);
	}
}
