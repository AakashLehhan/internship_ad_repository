package com.mastek;

import java.util.ArrayList;
import java.util.List;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App14 {

	public static void main(String[] args) {
		System.out.println("1 step mapping slide 87");

		List<Person> persons = new PersonList().getPersons();
		final List<Integer> personAge = new ArrayList<Integer>();
		persons.forEach((p) -> {

			personAge.add(p.getAge());

		});

		System.out.println("Total count person : " + persons.size());
		System.out.println("Total count  age list of person : " + personAge.size());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("2 step Filter slide 88");

		final List<Integer> personAgegt20 = new ArrayList<Integer>();
		personAge.forEach(age -> {
			if (age > 20) {
				personAgegt20.add(age);
			}
		});
		System.out.println("Total count age>20  : " + personAgegt20.size());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("3 step Reduce slide 89");
		float sum=0;
		for(int age : personAgegt20) {
			sum=sum+age;			
		}
		System.out.println("« Average of the age people older than 20 »"+sum/personAgegt20.size());
	}

}
