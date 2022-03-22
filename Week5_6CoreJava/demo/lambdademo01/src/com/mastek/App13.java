package com.mastek;

import java.util.function.Predicate;

public class App13 {

	public static void main(String[] args) {
		Predicate<String> p1=Predicate.isEqual("Mastek");
		System.out.println("mastek "+p1.test("mastek"));
		System.out.println("Mastek "+p1.test("Mastek"));
	}

}
