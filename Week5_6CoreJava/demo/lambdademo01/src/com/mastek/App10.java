package com.mastek;

import java.util.function.Predicate;

public class App10 {

	public static void main(String[] args) {
		Predicate<String> predicate1=s->s.length()>20;
		System.out.println("predicate1.test(\"Dhanashree\")");
		System.out.println(predicate1.test("Dhanashree"));
		
		Predicate<String> predicate2=s->s.length()<20;
		System.out.println("predicate1.test(\"Dhanashree\")");
		System.out.println(predicate2.test("Dhanashree"));
	}

}
