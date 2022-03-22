import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.mastek.model.Person;
import com.mastek.model.PersonList;

public class App22 {

	public static void main(String[] args) {
		System.out.println("Collect");
		List<Person> people=new PersonList().getPersons();
		
		people.stream().filter(p->p.getAge()>20).forEach(System.out::println);
		
		System.out.println(".collect(Collectors.joining(','))");
		String result=people.stream()	
						    .filter(p->p.getAge()>20)
						    .map(Person::getName)
						    .collect(Collectors.joining(","));
		System.out.println(result);
		
		System.out.println(".collect(Collectors.toList())");
		List<String> names=people.stream()	
								 .filter(p->p.getAge()>20)
								 .map(Person::getName)
								 .collect(Collectors.toList());
		names.stream().forEach(System.out::println);	
		System.out.println(".collect(Collectors.groupingBy(Person::getAge))");
		Map<Integer,List<Person>> groupOfPeopleAgeGt20=people.stream()
				.filter(p->p.getAge()>20)
				.collect(Collectors.groupingBy(Person::getAge));
		groupOfPeopleAgeGt20.entrySet().stream().forEach(System.out::println);
		
		Map<Integer,Long> countOfPeople=
				people.stream()
				.filter(p-> p.getAge()>20)
				.collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
		System.out.println("group wise count");
		countOfPeople.entrySet().stream().forEach(System.out::println);
	}

}
 