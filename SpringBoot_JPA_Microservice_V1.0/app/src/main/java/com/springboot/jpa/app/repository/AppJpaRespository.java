package com.springboot.jpa.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.app.model.Person;

@Repository
public interface AppJpaRespository extends JpaRepository<Person, Integer> {
	
	List<Person> findAll();
	Optional<Person> findById(int id);
	void deleteById(int arg0);
	Person save(Person person);

}
