package com.bhavya.threadprevention;

public class Sleep {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Java is a");
		Thread.sleep(3000); // it delays the thread execution for 3000 ms of time
		System.out.println("Object Oriented");
		Thread.sleep(3000);
		System.out.println("Programming language !!");
	}

}
