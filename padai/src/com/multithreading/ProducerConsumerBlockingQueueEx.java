package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueueEx {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(2);
        Thread t1 = new Thread( new Producer1(q));
        Thread t2 = new Thread(new Consumer1(q));
        t1.start();
        t2.start();

    }


}
class Producer1 implements  Runnable{
    BlockingQueue<Integer> sharedQ;
    public Producer1(BlockingQueue q){
        this.sharedQ = q;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i++){
            System.out.println( "Thread name :"+Thread.currentThread().getName()+":    producer has produced num :"+i);
            try {
                sharedQ.put(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer1 implements  Runnable{
    BlockingQueue<Integer> sharedQ;
    public Consumer1(BlockingQueue q){
        this.sharedQ = q;
    }

    @Override
    public void run() {
        while(true){
            try {
            System.out.println( "Thread name :"+Thread.currentThread().getName()+":    consumer has consumed  :"+sharedQ.take());


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}