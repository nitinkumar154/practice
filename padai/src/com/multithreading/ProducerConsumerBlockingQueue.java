package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

  public static void main(String[] args) {
    final BlockingQueue<Object> sharedQueue = new ArrayBlockingQueue<Object>(3);
    Thread producer = new Thread(new ProducerBlockingQ(sharedQueue), "producer");
    Thread consumer = new Thread(new ConsumerBlockingQ(sharedQueue), "consumer");
    producer.start();
    consumer.start();
   

  }

}

class ProducerBlockingQ implements Runnable{
  
  private final BlockingQueue<Object> sharedQueue ;

  public ProducerBlockingQ(BlockingQueue<Object> sharedQueue) {
    super();
    this.sharedQueue = sharedQueue;
  }
  @Override
  public void run() {
    try {
    for (int i = 0; i < 20; i++) {
     System.out.println( "Thread name :"+Thread.currentThread().getName()+":    producer has produced num :"+i);
      sharedQueue.put(i);
  }
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

class ConsumerBlockingQ implements Runnable{
private final BlockingQueue<Object> sharedQueue;
public ConsumerBlockingQ(BlockingQueue<Object> sharedQueue) {
  super();
  this.sharedQueue = sharedQueue;
}

@Override
public void run() {
  try {
  while (true) {
    
      System.out.println("Thread name :"+Thread.currentThread().getName()+":    we have consumed :"+sharedQueue.take());
    
  }
  } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  
  
}

}