package demo_thread01;

import java.time.LocalTime;

public class MyThread extends Thread{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("########## "+name +" Started ########## ");
		for(int i=1;i<10;i++) {
			System.out.println(name+" # "+LocalTime.now());
		}
		System.out.println("########## "+name +" Ended ########## ");
	}
}
