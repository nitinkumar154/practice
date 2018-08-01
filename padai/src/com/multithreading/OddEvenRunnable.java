package com.multithreading;

public class OddEvenRunnable implements Runnable {
int maxNumber = 20;
private final static Object lock = new Object();
int remainder ;
private static int count =1;

	public OddEvenRunnable(int remainder) {
	super();
	this.remainder = remainder;
}


	@Override
	public void run() {
	while(count<maxNumber) {
	
		synchronized (lock) {
		while(count%2!=remainder) {
			
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"  ::: "+count++);
		lock.notify();
	}

	}
	}
}
