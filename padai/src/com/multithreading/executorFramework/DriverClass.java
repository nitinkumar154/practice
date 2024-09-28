package com.multithreading.executorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class DriverClass {

	public static void main(String[] args) {

		ThreadPoolExecutor th  = (ThreadPoolExecutor) Executors.newFixedThreadPool(4); 
		
		
		for (int i = 0; i < 10; i++) {
			
			MyFile file = new MyFile("FileName"+i);
			th.execute(file);
			
		}
		
th.shutdown();		
		
	}

}
