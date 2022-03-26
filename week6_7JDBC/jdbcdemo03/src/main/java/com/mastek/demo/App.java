package com.mastek.demo;

import java.util.Scanner;

import com.training.demo.Menu;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World of Maven!");
		final Menu menu=Menu.getMenu();
		try {
			Scanner sc=new Scanner(System.in);
			boolean test=true;
			while(test){
				menu.createMenu(sc);
				System.out.println("To Continue press Y");
				String choice=sc.nextLine();
				if(!choice.equalsIgnoreCase("y")){
					test=false;
				}
			}
			
			
			sc.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
