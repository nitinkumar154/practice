package com.multithreading;

public class DeadLock {

  public static void main(String[] args) {
   Thread t1 = new Thread() {
     
     public void run () {
     synchronized (Integer.class) {
       System.out.println("obtained lock on the integer object");
       
       synchronized (String.class) {
         System.out.println("obtained lock on the string");
      }
    }
     }
   };
   
   
Thread t2 = new Thread() {
     
     public void run () {
     synchronized (Integer.class) {
       System.out.println("obtained lock on the String object");
       
       synchronized (String.class) {
         System.out.println("obtained lock on the Integer");
        
      }
      
    }
     
       
       
     }
   };

   t1.start();
   t2.start();
  }

}
