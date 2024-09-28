package com.multithreading.executorFramework;

import java.util.stream.Stream;

public class DeadLOckEx {
    public static void main(String[] args) {
        Runnable t1 = ()->{
            synchronized (Integer.class){
                System.out.println("lock on Integer");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (String.class){
                    System.out.println("lock on string");
                }
            }

        };

        Runnable t2 = ()->{
            synchronized (String.class){
                System.out.println("lock on String");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (Integer.class){
                    System.out.println("lock on Integer");
                }
            }

        };
        Thread t = new Thread(t1);
        Thread b = new Thread(t2);
        t.start();
        b.start();
    }


}
