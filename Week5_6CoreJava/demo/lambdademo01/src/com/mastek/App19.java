package com.mastek;

import java.util.ArrayList;
import java.util.List;

public class App19 {

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
		System.out.println("######### all numbers");
		numbers.stream().forEach(System.out::println);
		Integer sum=numbers.stream().reduce(0, (n1,n2)->n1+n2);
		System.out.println("Sum "+sum);
		System.out.println("Avg "+sum/numbers.size());
		System.out.println("Count "+numbers.size());
		numbers.sort((c1,c2)->c1-c2);
		System.out.println("Min "+numbers.get(0));
		System.out.println("Max "+numbers.get(numbers.size()-1));
		
		
		
	}
}
