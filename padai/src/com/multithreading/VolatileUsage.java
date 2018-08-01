package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileUsage {
static int x= 0; 
static int y=0;
  public static void method1 () {
x++;
y++;
}
public static void method2() {
  System.out.println("thread name :"+Thread.currentThread().getName()+" x : "+x++ +" y : "+y++);
}
  public static void main(String[] args) {
    
    
   // VolatileUsage  usage=new VolatileUsage();
   ExecutorService executorService= Executors.newFixedThreadPool(6);
   
   for(int j=1;j<=10;j++) {
   executorService.submit(new Runnable() {
    
    @Override
    public void run() {
     
     method1();
     method2();
    }
  });
   /*Thread t1 = new Thread("t1") {
     public void run () {
       
       for (int i = 0; i < 4; i++) {
        method1();
      }
     }
   };
   
   
   Thread t2 = new Thread("t2") {
     public void run() {
       for (int i = 0; i < 10; i++) {
        method2();
      }
     }
   };
t1.start();
t2.start();
*/  }

  }
}
