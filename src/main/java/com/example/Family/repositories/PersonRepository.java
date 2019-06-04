package com.example.Family.repositories;

import com.example.Family.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
