package com.multithreading;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerDesignPattern {

  public static void main(String[] args) {
   Queue<Integer>  sharedResource = new  ArrayBlockingQueue<Integer>(4);
   int size = 4;
   
   Thread producer = new Thread(new Producer(sharedResource, size));
   Thread consumer = new Thread(new Consumer(sharedResource, size));
   producer.start();
   consumer.start();
   
    
    
   

  }

}
