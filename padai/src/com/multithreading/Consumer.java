package com.multithreading;

import java.util.Queue;
import java.util.Vector;

public class Consumer implements Runnable {
  private final Queue<Integer> sharedQueue;
  private final int SIZE;



  public Consumer(Queue sharedQueue, int sIZE) {
    this.sharedQueue = sharedQueue;
    SIZE = sIZE;
  }

  @Override
  public void run() {
while (true) {
try {
 System.out.println("value consumed is :" +consume());
} catch (Exception e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}  
}   

  }

  private int consume() throws InterruptedException{
   synchronized (sharedQueue) {
    while (sharedQueue.isEmpty()) {
      System.out.println("waiting for producer to produce the items thread: "+Thread.currentThread().getName());
      sharedQueue.wait();
    }
   }
    
    synchronized (sharedQueue) {
      sharedQueue.notifyAll();
      return (Integer) sharedQueue.poll();
    }

  }
}
