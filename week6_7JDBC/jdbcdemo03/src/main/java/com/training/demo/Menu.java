package com.training.demo;

import java.util.List;
import java.util.Scanner;

import com.training.demo.controller.DeptController;
import com.training.demo.model.Dept;

//Singleton class / design Pattern
public class Menu {

	private static Menu menu;
	private static final DeptController DEPT_CONTROLLER=new DeptController();
	private Menu() {
		super();
	}

	public static Menu getMenu(){
		if(menu==null){
			synchronized (Menu.class) {
				if(menu==null){
					menu=new Menu();
				}
			}
		}
		return menu;
	}
	public void createMenu(Scanner sc) throws Exception{
		
		System.out.println("Select Operation from below menu:");
		System.out.println("1. Create New Department");
		System.out.println("2. Display All Department");
		System.out.println("3. Find Department");
		System.out.println("4. Update Department");
		System.out.println("5. Delete Department");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice){
		case 1:
			System.out.println("Enter dept name");
			final String dname=sc.nextLine();
			System.out.println("Enter branchno");
			final int branchno=Integer.parseInt(sc.nextLine());
			Dept newDept=new Dept(dname,branchno);
			DEPT_CONTROLLER.create(newDept);
			break;
		case 2:
			System.out.println("All Departments");
			final List<Dept> list=DEPT_CONTROLLER.findAll();
			list.stream().forEach(System.out::println);
			break;
		case 3: 
			System.out.println("Enter deptno");
			final int id=Integer.parseInt(sc.nextLine());
			System.out.println("Get "+id+" details");
			final Dept dept=DEPT_CONTROLLER.FindOne(id);
			System.out.println(dept);
			break;
		case 4:
			System.out.println("Enter deptno");
			final int deptno=Integer.parseInt(sc.nextLine());			
			System.out.println("Enter dept name");
			final String newdname=sc.nextLine();
			final Dept olddept=DEPT_CONTROLLER.FindOne(deptno);
			olddept.setDname(newdname);
			if(DEPT_CONTROLLER.update(olddept)){
				System.out.println("Updated "+olddept);
			}
			break;
		case 5:
			System.out.println("Enter deptno");
			final int ddeptno=Integer.parseInt(sc.nextLine());			
			final Dept deletedept=DEPT_CONTROLLER.FindOne(ddeptno);
			if(DEPT_CONTROLLER.delete(deletedept)){
				System.out.println("Deleted "+deletedept);
			}
			break;
		default:
			System.out.println("Select appropriate options from above list");
			break;
		}
		
		
		
		
		
		
	}
}
