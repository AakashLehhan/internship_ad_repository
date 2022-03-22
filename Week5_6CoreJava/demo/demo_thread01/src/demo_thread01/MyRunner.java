package demo_thread01;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class MyRunner implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("########## "+name +" Started ########## ");
		for(int i=1;i<10;i++) {
			System.out.println(name+" # "+LocalTime.now()+"                                "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("########## "+name +" Ended ########## ");
	
		
	}
	
	

}
