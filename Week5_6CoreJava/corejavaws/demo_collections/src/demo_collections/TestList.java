package demo_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {

		//1.Create a List
		//list accepts object data
		//primitive->int 111=>converted into Integer (wrapper class)
		//everything is added as object
		List listOfNames=new ArrayList();
		listOfNames.add("Swapnil");
		listOfNames.add("Sarfraz");
		listOfNames.add("Gaurav");
		listOfNames.add(111);
		listOfNames.add(111.11);
		listOfNames.add(111.11f);
		listOfNames.add(new Person("Shweta"));
		
		Iterator iterator=listOfNames.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(Object o : listOfNames) {
			System.out.println(o.getClass()+" "+o);
		}
		//remove element
		System.out.println("Remove Gaurav"+listOfNames.remove("Gaurav"));
		System.out.println("After removal ");
		System.out.println(listOfNames);
		System.out.println("Contains Gaurav : "
		+listOfNames.contains("Gaurav"));
		System.out.println("Contains Swapnil : "
				+listOfNames.contains("Swapnil"));
		System.out.println("contains new Person(\"Shweta\"): "+
				listOfNames.contains(new Person("Shweta")));		
		System.out.println("contains new Person(\"Shwetaa\"): "+
				listOfNames.contains(new Person("Shwetaa")));	
		
		for(Object o: listOfNames) {
			if(o instanceof Integer) {
				int number=(int) o;
				System.out.println(" Sqare "+Math.pow(number, 2));
			}
			if(o instanceof String) {
				System.out.println(((String) o).toUpperCase());
			}
			if(o instanceof Double) {
				double d= (double) o;
				System.out.println(" Cube "+Math.pow(d, 3));
			}
			if(o instanceof Float) {
				float d= (float) o;
				System.out.println(" Cube "+Math.pow(d, 3));
			}
			
			
			if(o instanceof Person) {
				System.out.println(((Person) o).getFirstName().toLowerCase());
			}
			
		}
	}
}
//Benifit: dynamic
//drawback: it stores collection of object
//			works on different objects
// 			we need to check the type of data for 
//			performing operations

