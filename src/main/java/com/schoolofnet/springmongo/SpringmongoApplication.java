package com.schoolofnet.springmongo;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmongoApplication {
	
	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	PersonRepository personRepository;

	@PostConstruct
	public void init() {
		System.out.println("Hello world from PostConstructor");
	}
	
	@PreDestroy
	public void shutdown() {
		
	}
	
//	@Override
//	public void run(String... args) throws Exception {
//		Person person1 = new Person();
//		person1.setName("Leonan");
//		Person savedPerson = this.personRepository.save(person1);
//		
//		Company company1 = new Company();
//		company1.setName("School of net");
//		company1.setPeople(Arrays.asList(savedPerson));
//		Company savedCompany = this.companyRepository.save(company1);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmongoApplication.class, args);
	}
}
