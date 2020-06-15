package com.springboot.jpa.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.app.model.Address;
import com.springboot.jpa.app.model.Person;
import com.springboot.jpa.app.repository.AppJpaRespository;

@RestController
public class AppDataController {

	@Autowired
	AppJpaRespository appJpaRespository;
	
	@GetMapping("/")
	public List<Person> getAllPersons(){
		return appJpaRespository.findAll();
	}
	
	@GetMapping("/persons/{id}")
	public List<Address> getAddressByPersonId(@PathVariable int id){
		return appJpaRespository.findById(id).get().getAddress();
	}
	@PostMapping("/")
	public void savePerson(@RequestBody Person person){
		appJpaRespository.save(person);
	}
	
	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable int id){
		appJpaRespository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void updatePerson(@PathVariable int id, @RequestBody Person newPerson){
		Optional<Person> updatePerson = appJpaRespository.findById(id);
		Person updatedPerson = null;
		if(updatePerson.isPresent())
			updatedPerson = updatePerson.get();
		updatedPerson.setFirstName(newPerson.getFirstName());
		updatedPerson.setLastName(newPerson.getLastName());
		appJpaRespository.save(updatedPerson);
	}
}
