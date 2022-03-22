package com.mastek;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App18 {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		numbers.add(16);
		numbers.add(17);
		numbers.add(18);
		numbers.add(19);
		numbers.add(20);
		numbers.add(21);
		numbers.add(22);
		numbers.add(23);
		numbers.add(24);
		numbers.add(25);
		numbers.add(26);
		numbers.add(27);
		numbers.add(28);
		numbers.add(29);
		numbers.add(30);
		numbers.add(31);
		numbers.add(32);
		numbers.add(33);
		numbers.add(34);
		numbers.add(35);
		numbers.add(36);
		numbers.add(37);
		numbers.add(38);
		numbers.add(39);
		numbers.add(40);
		
		Predicate<Integer> p1=i->i>20;
		Predicate<Integer> p2=i->i<30;
		Predicate<Integer> p3=p1.and(p2);
		System.out.println("i>20 and i<30");
		numbers.stream().filter(p3).forEach(System.out::println);
		p3=p1.or(p2);
		System.out.println("i>20 or i<30");
		numbers.stream().filter(p3).forEach(System.out::println);
		p3=p1.negate();
		System.out.println("! i>20 ");
		numbers.stream().filter(p3).forEach(System.out::println);
				
		
	}

}
