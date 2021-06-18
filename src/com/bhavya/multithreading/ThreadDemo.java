package com.bhavya.multithreading;

public class ThreadDemo extends Thread{
	
	public synchronized void run() {
		
		for (int i=0;i<100;i++) {
			System.out.println("Child thread is executing !!");
		}
	}
	
	
	public void run(int a, int b) {
		
		int c=a+b;
		System.out.println("a+b value is :" +c);
	}

}
