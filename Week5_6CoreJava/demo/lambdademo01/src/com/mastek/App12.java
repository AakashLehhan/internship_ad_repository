package com.mastek;

import java.util.function.Predicate;

public class App12 {

	public static void main(String[] args) {
		Predicate<String> p1=s->s.length()<20;
		Predicate<String> p2=s->s.length()>1;
		Predicate<String> p3=p1.or(p2);
		System.out.println("p3=p1.or(p2);");
		System.out.println("Dhanashree has valid string length "+p3.test("Dhanashree"));		
		System.out.println("Om has valid string length "+p3.test("Om"));
		System.out.println("D has valid string length "+p3.test("D"));
	
	}

}
