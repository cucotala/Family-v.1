package com.example.Family;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {UserDetailsServiceAutoConfiguration.class})
public class FamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyApplication.class, args);
	}





}
