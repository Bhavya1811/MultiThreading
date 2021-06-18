package com.bhavya.threadprevention;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadDemo td= new ThreadDemo();
		td.start();
		td.join(); //until the current thread completes execution all threads should be in wait state
		
		for(int i=0; i<100; i++) {
			
			System.out.println("Main thread is executing!!");
		}

	}

}
