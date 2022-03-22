package demo_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayGenericList {

	public static void main(String[] args) {

//		 List<Person> listOfPerson=new ArrayList<>();
//		 listOfPerson.add(new Person("Gaurav"));
//		 listOfPerson.add(new Person("Swapnil"));
//		 listOfPerson.add(new Person("Madhukar"));
////		 listOfPerson.add("Aditya");//Error because list accepts only Person object
//		 
//		 ListIterator listIterator=listOfPerson.listIterator();
//		 System.out.println("from first entry to end : ");
//		 while(listIterator.hasNext()) {
//		 System.out.println(listIterator.next());
//		 }
//		 System.out.println("from end to first : ");
//		 while(listIterator.hasPrevious()) {
//		 System.out.println(listIterator.previous());
//		 }
		 
		 
		 List<Integer> numbers=new ArrayList<>();
		 numbers.add(3);
		 numbers.add(1);
		 numbers.add(2);
		 
//		 Iterator i=numbers.iterator();
//		 while(i.hasNext()) {
//		 System.out.println("Iterator Read "+i.next());
////		 numbers.add(123);
////		 i.add();
//		 }
		 System.out.println("Before "+numbers);
		 ListIterator literator=numbers.listIterator();
		 while(literator.hasNext()) {
		 System.out.println("ListIterator Read "+literator.next());
//		 numbers.add(123);//Gives Exception: ConcurrentModificationException
		 literator.add(123);
		 }
		 System.out.println("After "+numbers);
	}

}
