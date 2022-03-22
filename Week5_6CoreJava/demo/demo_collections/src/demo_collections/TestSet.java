package demo_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Person> set1=new HashSet<>();
		set1.add(new Person("Amit"));
		set1.add(new Person("Ajit"));
		set1.add(new Person("Sumit"));
		System.out.println(set1);
		for(Person p : set1) {
			System.out.println(p);
		}
		System.out.println("Iterator : ");
		Iterator iterator=set1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Size "+set1.size());
		System.out.println("new Person(\"Sumit\") is contained "+set1.contains(new Person("Sumit")));
		System.out.println("new Person(\"Sumit\") is removed "+set1.remove(new Person("Sumit")));
		System.out.println("After remove "+set1);
		System.out.println("Size "+set1.size());
	}
}
