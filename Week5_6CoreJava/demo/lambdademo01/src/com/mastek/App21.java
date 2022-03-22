package com.mastek;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App21 {

	public static void main(String[] args) {
		final List<Person> people=new PersonList().getPersons();
		Stream<Person> stream=people.stream();
		//over the age group >20 whats min value
		people.stream().map(p->p.getAge()).filter(age->age>20).forEach(System.out::println);
		Optional<Integer> minAge=stream.map(p->p.getAge())
									   .filter(age-> age>20)
									   .min(Comparator.naturalOrder());
		if(minAge.isPresent()) {
			System.out.println("Min Age in group age>20 is : "+minAge.get());
		}else {
			System.out.println("No one available in age >20");
		}
		
		
		
		boolean test=people.stream().map(p->p.getName()).allMatch(name->name.length()<10);
		System.out.println("name.length()<10"+test);
		people.stream().map(p->p.getName()).forEach(System.out::println);
	}

}
