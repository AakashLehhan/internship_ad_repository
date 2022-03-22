package demo_collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<Person> set1=new TreeSet<>();
		
		set1.add(new Person("Sumit"));
		set1.add(new Person("Amit"));
		set1.add(new Person("Sumit"));
		set1.add(new Person("Ajit"));
		set1.add(new Person("Sumit"));
		set1.add(new Person("Jit"));
		set1.add(new Person("Susmita"));
		set1.add(new Person("Babaita"));
		set1.add(new Person("Om"));
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
		// Ananomous : jis class ka koin nam nahi hai
		Set<Person> set2=new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				
				return o2.getFirstName().compareTo(o1.getFirstName());
			}
		});
		set2.add(new Person("Sumit"));
		set2.add(new Person("Amit"));
		set2.add(new Person("Sumit"));
		set2.add(new Person("Ajit"));
		set2.add(new Person("Sumit"));
		set2.add(new Person("Jit"));
		set2.add(new Person("Susmita"));
		set2.add(new Person("Babaita"));
		set2.add(new Person("Om"));
		
		System.out.println("Second comparator");
		iterator=set2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
}
}