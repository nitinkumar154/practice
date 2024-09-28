package com.multithreading;

public class FileReader implements Runnable {

	File file;

	public FileReader(File file) {
		super();
		this.file = file;
	}

	@Override
	public void run() {

synchronized (file) {

	System.out.println(Thread.currentThread().getName()+" is waiting for file to complete "+file.getName());
	try {
		file.wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(Thread.currentThread().getName()+" :file has been completed now !!! you can read.");
}
		
	}
	
	
	
	
	
}
