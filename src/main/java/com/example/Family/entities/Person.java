package com.example.Family.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


	@NotNull
	private String name;

	private String lastName;

	private int age;

	private String country;


	@OneToMany
	private List<Person> sons;


	@ManyToOne
	private Person dad;

 	//private long dadId;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getSons() {
		return sons;
	}

	public void setSons(List<Person> sons) {
		this.sons = sons;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Person getDad() {
		return dad;
	}

	public void setDad(Person dad) {
		this.dad = dad;
	}



}
