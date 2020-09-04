package net.kmdm1980.aboutkmdm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kmdm1980.aboutkmdm.model.Employer;
import net.kmdm1980.aboutkmdm.repository.EmployerRepository;

@Service
public class EmployerService {

	@Autowired
	private EmployerRepository employerRepository;
	
	public List<Employer> list() {
		return employerRepository.findAll();
	}
	
	public Employer find(Long id) {
		return employerRepository.getOne(id);
	}
	
	public void update(Employer emp) {
		employerRepository.save(emp);
	}
	
	public void delete(Employer emp) {
		employerRepository.delete(emp);
	}
}
