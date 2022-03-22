package com.mastek;

import java.time.LocalDateTime;

public class App05 {
	
	public static void main(String[] args) {
		System.out.println("Started "+Thread.currentThread()+" @ "+LocalDateTime.now());
		Runnable runnable=()->{
			System.out.println("Started "+Thread.currentThread()+" @ "+LocalDateTime.now());
			for(int i=0;i<10;i++) {
				System.out.println(i*i);
			}
			System.out.println("Ended "+Thread.currentThread()+" @ "+LocalDateTime.now());
		};
		Thread th=new Thread(runnable);
		th.start();
		System.out.println("Ended "+Thread.currentThread()+" @ "+LocalDateTime.now());
	}
	
}
/*
 * Thread 
 * 
 */