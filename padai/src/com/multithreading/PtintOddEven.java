package com.multithreading;

public class PtintOddEven {
	
	
	
	boolean odd ;
	int count =1;
	int maxNum = 20;
	
	public void printOdd() {
		synchronized (this) {
			while(count<=maxNum) {
				//System.out.println("checking odd number.");
				
				while(!odd) {
					
					try {
						System.out.println("system is waiting for the Even number!!");
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				System.out.println("Odd Number : "+count);
				count = count+1;
				odd=false;
				this.notify();
			}
		}
		
	}
	
	
	public void printEven() {
		synchronized (this) {
			while(count<=maxNum) {
			//	System.out.println("checking even number.");
				
				while(odd) {
					
					try {
						System.out.println("system is waiting for the odd number!!");
					this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
				System.out.println("Even Number : "+count);
				count = count+1;
				odd=true;
				this.notify();
			}
			
			
			
		}
		
		
	}
	public static void main(String[] args) {
		
		PtintOddEven o = new PtintOddEven();
		o.odd = true;
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				o.printOdd();
				
			}
		},"Odd");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				o.printEven();
				
			}
		}, "Even");
		
		t1.start();
		t2.start();
		
	}
	
	
}
