package demo_thread01;

import java.time.LocalTime;

public class TestRunner {

	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		System.out.println("########## "+name +" Started ########## ");
		
		MyRunner runner=new MyRunner();
		Thread th=new Thread(runner);
		th.setName(" MyRunner ");
		th.start();
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
