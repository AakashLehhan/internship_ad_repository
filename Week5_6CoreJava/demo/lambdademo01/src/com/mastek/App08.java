package com.mastek;

import java.util.function.Consumer;

public class App08 {

	public static void main(String[] args) {

		Consumer<String> consumer = s -> System.out.println(s);
		System.out.println("####### consumer = s -> System.out.println(s);");
		consumer.accept("Welcome to lambda expression deep dive");
		
		System.out.println("####### consumer =System.out::println;");
		consumer =System.out::println;
		consumer.accept("Welcome to lambda expression deep dive");
	}
}
