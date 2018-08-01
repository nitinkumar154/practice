package com.multithreading;

public class DriverMainForOddEvenWithRunnable {
	
	
	public static void main(String[] args) {
		OddEvenRunnable evenThread = new OddEvenRunnable(0);
		OddEvenRunnable oddThread =new OddEvenRunnable(1);
		
		Thread t1 = new Thread(evenThread, "EvenThread");
		Thread t2 = new Thread(oddThread, "OddThread");
		
		t1.start();
		t2.start();
		
		
		
		
		
		

		
		
		
		
	}

}
