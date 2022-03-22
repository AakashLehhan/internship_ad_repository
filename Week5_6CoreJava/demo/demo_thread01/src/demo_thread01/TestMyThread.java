package demo_thread01;

import java.time.LocalTime;

public class TestMyThread {

	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		System.out.println("########## "+name +" Started ########## ");
		MyThread thread1=new MyThread();
		thread1.setName(" MyThrad ");
		thread1.start();
		for(int i=1;i<10;i++) {
			System.out.println("Before sleep "+name+" # "+LocalTime.now());
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("After sleep "+name+" # "+LocalTime.now());
		}
		
		
		
		
		
		System.out.println("########## "+name +" Ended ########## ");

	}

}
