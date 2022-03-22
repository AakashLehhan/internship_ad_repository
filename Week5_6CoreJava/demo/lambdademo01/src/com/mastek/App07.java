package com.mastek;

import java.util.function.Function;

public class App07 {

	public static void main(String[] args) {
		Function<String,String> f=s->s.toLowerCase();
		System.out.println(f.apply("DHANASHREE"));
		
		f=s->s.toUpperCase();
		System.out.println(f.apply("dhanashree"));
		
		String name="DHANASHREE";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
	}

}
