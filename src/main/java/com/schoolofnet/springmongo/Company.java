package com.schoolofnet.springmongo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companies")
public class Company {
	
	@Id
	private String id;
	private String name;
	private List<Person> people;
	
	public Company() {
		
	}

	public Company(String name, List<Person> people) {
		this.name = name;
		this.people = people;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getPeople() {
		return people;
	}
	public void setPeople(List<Person> people) {
		this.people = people;
	}
}
