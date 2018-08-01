package com.multithreading;

import java.util.Queue;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {


  private final Queue<Integer> sharedQueue;
  private final int SIZE;

  public Producer(Queue sharedQueue, int size) {
      this.sharedQueue = sharedQueue;
      this.SIZE = size;
  }

  @Override
  public void run() {
      for (int i = 0; i < 20; i++) {
          System.out.println("Produced: " + i);
          try {
              produce(i);
          } catch (InterruptedException ex) {
              Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
          }

      }
  }

  private void produce(int i) throws InterruptedException {

      //wait if queue is full
      while (sharedQueue.size() == SIZE) {
          synchronized (sharedQueue) {
              System.out.println("Queue is full " + Thread.currentThread().getName()
                                  + " is waiting , size: " + sharedQueue.size());
              sharedQueue.wait();
          }
      }

      synchronized (sharedQueue) {
          sharedQueue.add(i);
          sharedQueue.notifyAll();
      }
  }



}
