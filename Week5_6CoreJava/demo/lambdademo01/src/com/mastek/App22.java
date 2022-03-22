package com.mastek;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App22 {

	public static void main(String[] args) {

		final List<Person> people=new PersonList().getPersons();
		System.out.println("« average of the age people older than 20 »" );
		
//		Optional<Integer> sum=(Optional<Integer>) people.stream()	
//									.filter(p->p.getAge()>20)
//									.reduce(0, accumulator);	
//		if(sum.isPresent()) {
//			System.out.println(sum.get());
//		}
	}

}
