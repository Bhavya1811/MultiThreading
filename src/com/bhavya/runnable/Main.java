package com.bhavya.runnable;

public class Main {

	public static void main(String[] args) {
		
		ThreadDemo td=new ThreadDemo();
		
		Thread t= new Thread(td);
		t.start();
		
		for(int i=0;i<100;i++) {
			
			System.out.println("Main thread is executing!!");
		}
	}

}
