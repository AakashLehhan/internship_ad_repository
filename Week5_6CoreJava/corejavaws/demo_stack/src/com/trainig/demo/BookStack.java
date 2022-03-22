package com.trainig.demo;

import java.util.ArrayList;

public class BookStack {

	private static final ArrayList<Book> bookList = new ArrayList<>();

	public BookStack() {
		super();
	}

	// to add new book
	public boolean push(Book book) {

		return bookList.add(book);
	}
	// pop/remove book
	public Book pop(){
		final int index=bookList.size()-1;
		return bookList.remove(index);
	}
	
	public static ArrayList<Book> getBooklist() {
		return bookList;
	}

	//peek
	public Book peek(){
		final int index=bookList.size()-1;
		return bookList.get(index);
	}
	
	
}
