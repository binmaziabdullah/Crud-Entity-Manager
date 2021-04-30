package com.entitymanagerexample.CrudEntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class CrudEntityManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudEntityManagerApplication.class, args);
	}

}
