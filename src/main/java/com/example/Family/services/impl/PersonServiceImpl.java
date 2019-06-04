package com.example.Family.services.impl;

import com.example.Family.entities.Person;
import com.example.Family.repositories.PersonRepository;
import com.example.Family.services.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonRepository personRepository;

	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> findAll() {

		return personRepository.findAll();

	}


	@Override
	public Person findOne(long id){

		return personRepository.findById(id).get();

	}


	@Override
	public Person save(Person person) {





		Person newPerson = new Person();
		newPerson.setName(person.getName());
		newPerson.setLastName(person.getLastName());
		newPerson.setAge(person.getAge());
		newPerson.setCountry(person.getCountry());




		if(person.getDad() != null) {


			personRepository.findById(person.getDad().getId()).get().getSons().add(newPerson);

		}

		return personRepository.save(newPerson);
		/*
		if(person.getDad() != null) {

			personRepository.findById(person.getDad().getId()).get().getSons().add(person);

		}*/

		//if (sons != null) {


					//newPerson.setSons(sons);


		//}

		//return personRepository.save(newPerson);
	}

	@Override
	public Person update (long id, Person person){

		Person newPerson = new Person();
		newPerson.setName(person.getName());
		newPerson.setLastName(person.getLastName());
		newPerson.setAge(person.getAge());
		newPerson.setCountry(person.getCountry());

		return personRepository.save(newPerson);

	}

	@Override
	public void delete(long id){

		personRepository.deleteById(id);
	}

}
