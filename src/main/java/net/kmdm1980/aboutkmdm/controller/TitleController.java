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

import net.kmdm1980.aboutkmdm.exception.TitleNotFoundException;
import net.kmdm1980.aboutkmdm.model.Title;
import net.kmdm1980.aboutkmdm.repository.TitleRepository;

@CrossOrigin
@RestController
public class TitleController {

	@Autowired
	private TitleRepository titleRepository;
	
	@GetMapping("/titles")
	public List<Title> all(){
		return titleRepository.findAll();
	}
	
	@GetMapping("/titles/{id}")
	public Title getOne(@PathVariable Long id) {
		return titleRepository.findById(id)
				.orElseThrow(() -> new TitleNotFoundException(id));
	}
	
	@GetMapping("/titles/employer/{id}")
	public List<Title> getTitlesByEmployer(@PathVariable Long id){
		return titleRepository.findTitlesByEmployerId(id);
	}
	
	@PostMapping("/titles")
	public Title addTitle(@RequestBody Title newTitle) {
		return titleRepository.save(newTitle);
	}
	
	@PutMapping("/titles/{id}")
	public Title updateTitle(@PathVariable Long id, @RequestBody Title newTitle) {
		return titleRepository.findById(id)
				.map(title -> {
					title.setName(newTitle.getName());
					title.setEmployer(newTitle.getEmployer());
					title.setFromDate(newTitle.getFromDate());
					title.setToDate(newTitle.getToDate());
					return titleRepository.save(title);
				}).orElseGet(() -> {
					newTitle.setId(id);
					return titleRepository.save(newTitle);
				});
	}
	
	@DeleteMapping("/titles/{id}")
	public void deleteTitle(@PathVariable Long id) {
		titleRepository.deleteById(id);
	}
}
