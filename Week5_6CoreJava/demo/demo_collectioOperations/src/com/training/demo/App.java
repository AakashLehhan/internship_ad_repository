package com.training.demo;

import java.util.ArrayList;

import com.training.demo.model.Person;
import com.training.demo.model.PersonCollection;

public class App {

	public static void main(String[] args) {
		final ArrayList<Person> people=PersonCollection.getPeople(); 
		final ArrayList<Person> peopleAgeGt20=new ArrayList<>();
		for(Person person : people){
			if(person.getAge()>20){
				peopleAgeGt20.add(person);
			}
		}	
		final ArrayList<Integer> ageList=new ArrayList<>();
		for(Person person:peopleAgeGt20){
			ageList.add(person.getAge());
		}
		double sum=0;
		for(Integer age : ageList){
			sum=sum+age;
		}
		final double average =sum/ageList.size();
		System.out.println("Average age of People group having age > 20 is "+average);
	}

}
