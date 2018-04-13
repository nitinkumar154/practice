package com.multithreading;

public class Driver {

	public static void main(String[] args) {
		File file = new File("Five point Someone");
		
		FileReader fr1 = new FileReader(file);
		FileReader fr2 = new FileReader(file);
		
		Thread t1 = new Thread(fr1, "Thread1");
		Thread t2 = new Thread(fr2, "Thread2");
		
		
		t1.start();
		t2.start();
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
FileWriter fw = new FileWriter(file);

Thread fwThread = new Thread(fw, "FileWriterThread");

		fwThread.start();
	
	
	}

}
