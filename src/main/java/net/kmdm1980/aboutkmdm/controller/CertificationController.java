package net.kmdm1980.aboutkmdm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.kmdm1980.aboutkmdm.exception.CertificationNotFoundException;
import net.kmdm1980.aboutkmdm.model.Certification;
import net.kmdm1980.aboutkmdm.repository.CertificationRepository;

@CrossOrigin
@RestController
public class CertificationController {

	@Autowired
	CertificationRepository certificationRepository;
	
	@GetMapping("/certifications")
	public List<Certification> getAllCerts() {
		return certificationRepository.findAll();
	}
	
	@GetMapping("/certifications/{id}")
	public Certification getOneCert(@PathVariable Long id) {
		return certificationRepository.findById(id).orElseThrow(() -> new CertificationNotFoundException());
	}
	
	@PostMapping("/certifications")
	public Certification postCert(@RequestBody Certification cert) {
		return certificationRepository.save(cert);
	}
	
	@PutMapping("/certifications/{id}")
	public Certification updateCert(@PathVariable Long id, @RequestBody Certification newCert) {
		return certificationRepository.findById(id)
				.map(cert -> {
					cert.setId(newCert.getId());
					cert.setIcon(newCert.getIcon());
					cert.setName(newCert.getName());
					cert.setUrl(newCert.getUrl());
					return certificationRepository.save(cert);
				}).orElseGet(() -> {
					newCert.setId(id);
					return certificationRepository.save(newCert);
				});
	}
	
	@DeleteMapping("/certifications/{id}") 
	public void deleteCert(@PathVariable Long id) {
		certificationRepository.deleteById(id);
	}
}
