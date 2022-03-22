package com.mastek;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App16 {

	public static void main(String[] args) {
	 final List<Person> persons=new PersonList().getPersons();
	 final List<String> personsName=new ArrayList<>();

	 final Consumer<Person> c0=System.out::println;
	 final Consumer<Person> c1=person->personsName.add(person.getName());
	 final Consumer<Person> c2=c1.andThen(c0);
	 
	 System.out.println("###############c1.andThen(c0)#################");
	 persons.stream().forEach(c2);
	 
	 System.out.println("################c4.andThen(c3)################");
	 final Consumer<String> c3=s->System.out.println(s);
	 final Consumer<String> c4=s->s.toUpperCase();
	 final Consumer<String> c5=c4.andThen(c3);
	 
	 personsName.stream().forEach(c5);
	 System.out.println("##############c0.andThen(c6)##################");
	 
	 final Consumer<Person> c6=person->{
		 		 person.setName(person.getName().toUpperCase());	 	
	 	};
	 final Consumer<Person> c7=c0.andThen(c6);
	 persons.stream().forEach(c7);
	 
	 System.out.println("##############c8.andThen(c0)##################");
	 final Consumer<Person> c8=person->{
 		 person.setName(person.getName().toLowerCase());	 	
	};
	 final Consumer<Person> c9=c8.andThen(c0);
	 persons.stream().forEach(c9);
	 
	 
	}

}
