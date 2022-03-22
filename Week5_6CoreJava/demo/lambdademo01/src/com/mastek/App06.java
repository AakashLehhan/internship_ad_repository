package com.mastek;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.mastek.model.Person;

public class App06 {

	public static void main(String[] args) {
		
		Comparator<Person>  c=(Person o1,Person o2)-> o1.getId()-o2.getId();
		
		Set<Person> persons=new TreeSet<>(c);
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
		System.out.println("Sorted Asc ID ");
		persons.forEach((person)->{System.out.println(person);});
		

		c=(Person o1,Person o2)-> o1.getName().compareTo(o2.getName());
		persons=new TreeSet<>(c);
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
		System.out.println("Sorted Asc name ");
		persons.forEach(System.out::println);
	}

}


