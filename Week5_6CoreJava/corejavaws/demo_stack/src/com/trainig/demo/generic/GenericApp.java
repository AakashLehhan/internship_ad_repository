package com.trainig.demo.generic;

import com.trainig.demo.Book;
import com.trainig.demo.Fruit;

public class GenericApp {

	public static void main(String[] args) {
		GenerickStack<Book> bookStack=new GenerickStack<>();
		System.out.println("After Push");
		bookStack.push(new Book("Wings of Fire","Dr. A. P. J. Kalam"));
		bookStack.push(new Book("Wings of Fire","Dr. A. P. J. Kalam"));
		bookStack.push(new Book("Wings of Fire","Dr. A. P. J. Kalam"));		
		bookStack.getArrayList().forEach(System.out::println);
		System.out.println("@@@@ Removed "+bookStack.pop());
		System.out.println("After Pop");
		bookStack.getArrayList().forEach(System.out::println);
		System.out.println("@@@@ Peeked "+bookStack.peek());
		System.out.println("After Peek");
		bookStack.getArrayList().forEach(System.out::println);
		System.out.println("#######################################");
		GenerickStack<Fruit> fruitStack=new GenerickStack<>();
		System.out.println("After Push");
		fruitStack.push(new Fruit("Pineapple"));
		fruitStack.push(new Fruit("MuskMelon"));
		fruitStack.push(new Fruit("WaterMelon"));
		fruitStack.getArrayList().forEach(System.out::println);
		System.out.println("@@@@ Removed "+fruitStack.pop());
		System.out.println("After Pop");
		fruitStack.getArrayList().forEach(System.out::println);
		System.out.println("@@@@ Peeked "+fruitStack.peek());
		System.out.println("After Peek");
		fruitStack.getArrayList().forEach(System.out::println);
		
		

	}

}
