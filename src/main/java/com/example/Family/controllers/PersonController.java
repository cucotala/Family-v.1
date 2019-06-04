package com.example.Family.controllers;

import com.example.Family.entities.Person;
import com.example.Family.services.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PersonController {

	private final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}


	@GetMapping("/people")
	public List<Person> findAll(){

		return personService.findAll();
	}

	@GetMapping("people/{id}")
	public Person findOne(@PathVariable long id){

		return personService.findOne(id);
	}



	@PostMapping("/people")
	public Person save (@Valid @RequestBody Person person){

		return personService.save(person);
	}

	@PutMapping("/people/{id}")
	public Person update(@PathVariable long id, @Valid @RequestBody Person person){

		return personService.update(id, person);

	}

	@DeleteMapping("/people/{id}")
	public void delete(@PathVariable long id){

		personService.delete(id);

	}


}
