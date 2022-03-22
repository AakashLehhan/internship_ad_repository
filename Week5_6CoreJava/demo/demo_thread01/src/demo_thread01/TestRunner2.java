package demo_thread01;

import java.time.LocalTime;

public class TestRunner2 {

	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		System.out.println("########## "+name +" Started ########## ");
		
		MyRunner runner=new MyRunner();
		Thread th=new Thread(runner);
		th.setName(" MyRunner ");
		th.setDaemon(false);
		th.start();
		for(int i=1;i<10;i++) {
			try {
				Thread.sleep(500);
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("After sleep "+name+" # "+LocalTime.now()+"                                "+i);
		}
		System.out.println("########## "+name +" Ended ########## ");
		
		System.out.println("MyRunner "+th.isAlive());
		System.out.println("Main     "+Thread.currentThread().isAlive());
	}

}
