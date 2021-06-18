package com.bhavya.threadprevention;

public class ThreadDemo extends Thread{
	
	public void run() {
		
		//Thread.yield(); // It stops the currently running thread and gives priority for the other threads to execute
		
		for(int i=0; i<100; i++) {
			
			System.out.println("Child thread is executing!!");
			
		}
	}

}
