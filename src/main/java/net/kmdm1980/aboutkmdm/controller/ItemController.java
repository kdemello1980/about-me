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

import net.kmdm1980.aboutkmdm.exception.ItemNotFoundException;
import net.kmdm1980.aboutkmdm.model.Item;
import net.kmdm1980.aboutkmdm.repository.ItemRepository;

@CrossOrigin
@RestController
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	@GetMapping("/items")
	public List<Item> getAll(){
		return itemRepository.findAll();
	}

	@GetMapping("/items/{id}")
	public Item getOne(@PathVariable Long id) {
		return itemRepository.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
	}
	
	@GetMapping("/items/title/{id}")
	public List<Item> getItemsByTitle(@PathVariable Long id){
		return itemRepository.findAllByTitleId(id);
	}
	
	@PostMapping("/items")
	public Item addItem(@RequestBody Item newItem) {
		return itemRepository.save(newItem);
	}
	
	@PutMapping("/items/{id}")
	public Item updateItem(@PathVariable Long id, @RequestBody Item newItem) {
		 return itemRepository.findById(id).map(item -> {
			 item.setText(newItem.getText());
//			 item.setTitle(newItem.getTitle());
			 return itemRepository.save(item);
		 }).orElseGet(() -> {
			 newItem.setId(id);
			 return itemRepository.save(newItem);
		 });
	}
	
	@DeleteMapping("/items/{id}")
	public void deleteItem(@PathVariable Long id) {
		itemRepository.deleteById(id);
	}
}
