package com.mastek.model;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

	private List<Person> persons=new ArrayList<>();
	
	public PersonList() {
		super();
		persons.add(new Person("Yashvita", 21));
		persons.add(new Person("Kiran"	 , 20));
		persons.add(new Person("Saurabh" , 18));
		persons.add(new Person("Tejas"   , 23));
		persons.add(new Person("Amruta"  , 24));
		persons.add(new Person("Sarvesh" , 20));
		persons.add(new Person("Bhanu"   , 25));
		persons.add(new Person("Satvik"  , 25));
		persons.add(new Person("Akhil"   , 22));
		persons.add(new Person("Mehul"   , 19));
		
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	
	
}
