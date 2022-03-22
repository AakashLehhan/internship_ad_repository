package com.mastek;

import java.util.List;
import java.util.function.Consumer;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App09 {

	public static void main(String[] args) {
		List<Person> persons=new PersonList().getPersons();
		
		Consumer<Person> consumer=System.out::println;
		persons.forEach(consumer);
		
//		persons.forEach(System.out::println);
		Iterable iterable=null;
	}

}
