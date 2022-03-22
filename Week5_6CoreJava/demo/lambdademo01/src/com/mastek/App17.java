package com.mastek;

import java.util.List;
import java.util.stream.Stream;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App17 {

	public static void main(String[] args) {
		final List<Person> people=new PersonList().getPersons();
		//1st operation iteration over list
		System.out.println("All people from the list");
		people.stream().forEach(System.out::println);
//		2nd opertion filter age>20
		System.out.println("All people from the list age>20 ");
		people.stream().filter(p->p.getAge()>20).forEach(System.out::println);
	}

}
