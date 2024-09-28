package com.multithreading;

public class FileWriter implements Runnable {

	File file;
	
	
	
	public FileWriter(File file) {
		super();
		this.file = file;
	}



	@Override
	public void run() {
		synchronized (file) {
		System.out.println("file writing starting now :"+file.getName());
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
file.setComplete(true);
System.out.println("file writing has been completed ");
file.notifyAll();
System.out.println("notifying one of the reader class");
		
		
		
		
		}
		
		

	}

}
