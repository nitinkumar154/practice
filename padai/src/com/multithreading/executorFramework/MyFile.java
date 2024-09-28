package com.multithreading.executorFramework;

public class MyFile implements Runnable {

 private String fileName;
 
	
	
	
	public MyFile(String fileName) {
	super();
	this.fileName = fileName;
}
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		try {
			System.out.println("Fetching info from the file "+this.fileName+" by the thread name : :"+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("file read is successfully "+this.fileName+" thread::"+Thread.currentThread().getName());
		
		} catch (Exception e) {
			e.printStackTrace();
		
		}

	}
}
