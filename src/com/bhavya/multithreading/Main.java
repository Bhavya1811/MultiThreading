package com.bhavya.multithreading;

public class Main {

	public synchronized static void main(String[] args) {
		
		ThreadDemo td = new ThreadDemo();
		
		// To execute the thread we need to call the start method
		
		td.start(); //start method will create a new thread
		
		td.run(12, 8);
		
		for(int i=0; i<100; i++) {
			
			System.out.println("Main thread is executing !!");
		}

	}

}
