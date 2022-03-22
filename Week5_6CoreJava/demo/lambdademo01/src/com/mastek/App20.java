package com.mastek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class App20 {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		System.out.println("######### all numbers");
		numbers.stream().forEach(System.out::println);
		Integer sum=numbers.stream().reduce(0, (n1,n2)->n1+n2);
		System.out.println("Sum "+sum);
		
		System.out.println("Add 10 number in list");
		numbers.add(10);
		sum=numbers.stream().reduce(0, (n1,n2)->n1+n2);
		System.out.println("Sum "+sum);
		
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);
		numbers.add(100);
		
		BinaryOperator<Integer> maxvalue=(i1,i2)->i1>i2?i1:i2;
		Stream<Integer> stream=Stream.empty();
		Optional<Integer> max=stream.max(Comparator.naturalOrder());
		System.out.println("Empty Stream ");
		if(max.isPresent()) {
			System.out.println(max.get());
		}else {
			System.out.println("STream is empty");
		}
		System.out.println("stream with numbers ");
		stream=numbers.stream();
		max=stream.max(Comparator.naturalOrder());
		if(max.isPresent()) {
			System.out.println("MAX "+max.get());
		}else {
			System.out.println("STream is empty");
		}
		
		stream=numbers.stream();
		Optional<Integer> min=stream.min(Comparator.naturalOrder());
		if(min.isPresent()) {
			System.out.println("MIN "+min.get());
		}else {
			System.out.println("STream is empty");
		}
		
		stream=numbers.stream();
		Long count=stream.count();
		System.out.println("count "+count);
		
	}

}
