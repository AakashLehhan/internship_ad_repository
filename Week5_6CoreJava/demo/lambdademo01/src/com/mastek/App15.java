package com.mastek;

import java.util.List;
import java.util.stream.Stream;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App15 {

	public static void main(String[] args) {
		System.out.println("Slide 106 - 108");
		final List<Person> persons=new PersonList().getPersons();
		System.out.println("Way 1 - Stream<Person> personStream=persons.stream();");
		Stream<Person> personStream=persons.stream();
		personStream.forEach(System.out::println);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Way 2 - persons.stream().forEach(System.out::println);");
		persons.stream().forEach(System.out::println);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
	}
}
