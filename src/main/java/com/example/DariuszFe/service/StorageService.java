package com.example.DariuszFe.service;

import java.util.ArrayList;
import java.util.List;

import com.example.DariuszFe.domain.Person;

public class StorageService {
	
	private List<Person> db = new ArrayList<Person>();
	
	public void add(Person person){
		Person newPerson = new Person(person.getFirstName(), person.getYob());
		db.add(newPerson);
	}
	
	public List<Person> getAllPersons(){
		return db;
	}

}
