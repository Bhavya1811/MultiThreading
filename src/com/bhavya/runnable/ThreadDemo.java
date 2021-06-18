package com.bhavya.runnable;

public class ThreadDemo implements Runnable{
	
	public void run() {
		
		for(int i=0; i<100; i++) {
			
			System.out.println("Child thread is executing!!");
		}
	}

}
