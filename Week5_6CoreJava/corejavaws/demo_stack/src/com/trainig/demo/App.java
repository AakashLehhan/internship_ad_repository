package com.trainig.demo;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		BookStack bookStack=new BookStack();
		System.out.println("Add Book");
		bookStack.push(new Book("Let us C","Yashwant Kanitkar"));
		bookStack.push(new Book("COA","PressMan"));
		bookStack.push(new Book("Computer Graphics","Godse"));
		System.out.println("After Calling push");
		displayList(bookStack);
		System.out.println("After Calling pop");
		System.out.println("Removed "+bookStack.pop());
		displayList(bookStack);
		System.out.println("After Calling peek");
		System.out.println("Peeked "+bookStack.peek());
		displayList(bookStack);
	}

	private static void displayList(BookStack bookStack) {
		ArrayList<Book> bookList=bookStack.getBooklist();
		for(Book book:bookList){
			System.out.println(book);
		}
	}

}
