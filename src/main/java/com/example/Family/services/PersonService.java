package com.example.Family.services;

import com.example.Family.entities.Person;

import java.util.List;

public interface PersonService {


	List<Person> findAll();

	Person save (Person person);

	Person update(long id, Person person);

	Person findOne(long id);

	void delete(long id);
}
